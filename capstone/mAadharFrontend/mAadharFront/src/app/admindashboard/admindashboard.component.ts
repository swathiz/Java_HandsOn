import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ApiService } from '../shared/api.service';
import { AadharData } from './aadhardata.model';
import { Aadhars } from './aadhars';
import { AadharsService } from './aadhars.service';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent implements OnInit {

  formValue !: FormGroup;
  employeeModelObj : AadharData = new AadharData();
  employeeData : any;
  aadharsObj : Aadhars = new Aadhars();
  aadharsData : any;
  fdataa: number;
  showAdd !: boolean;
  showUpdate !: boolean;
  aadhars: Aadhars[];
  

  constructor(private formbuiler: FormBuilder, private api : ApiService, private adharsService : AadharsService,) { }

  ngOnInit(): void {
    this.formValue = this.formbuiler.group({
      id : [''],
      name : [''],
      email : [''],
      mobile : [''],
      address : [''],
      gender : [''],
      dob : [''],
      action:['']
    })
    this.getAllEmployee();
  }

  postEmployeeDetails()
  {
    this.employeeModelObj.id = this.formValue.value.id;
    this.employeeModelObj.name = this.formValue.value.name;
    this.employeeModelObj.email = this.formValue.value.email;
    this.employeeModelObj.mobile = this.formValue.value.mobile;
    this.employeeModelObj.address = this.formValue.value.address;
    this.employeeModelObj.gender = this.formValue.value.gender;
    this.employeeModelObj.dob = this.formValue.value.dob;
    this.employeeModelObj.action= this.formValue.value.action;
 
    this.api.postEmployee(this.employeeModelObj)
    .subscribe(res=>{
      console.log(res);
      alert("employee Added")
      let ref = document.getElementById('cancel')
      ref?.click();
      this.formValue.reset();
      this.getAllEmployee();


    },
    err=>{
      alert("Something went wrong")
    })
  }

  getAllEmployee(){
    this.api.getEmployee()
    .subscribe(res=>{
      this.employeeData = res;

    })
  }

  onEdit(temp: any)
  {
    this.formValue.controls['name'].setValue(temp.name);
    this.formValue.controls['gender'].setValue(temp.gender);
    this.formValue.controls['dob'].setValue(temp.dob);
    this.formValue.controls['address'].setValue(temp.address);
    this.formValue.controls['email'].setValue(temp.email);
    this.formValue.controls['mobile'].setValue(temp.mobile);
    this.uid = temp.id;
  }
  public uid: number;

  updateEmployee()
  {
    this.aadharsObj.id = this.uid;
    this.aadharsObj.name = this.formValue.value.name;
    this.aadharsObj.gender = this.formValue.value.gender;
    this.aadharsObj.dob = this.formValue.value.dob;
    this.aadharsObj.address = this.formValue.value.address;
    this.aadharsObj.email = this.formValue.value.imageUrl;
    this.aadharsObj.mobile = this.formValue.value.mobile;
    this.aadharsObj.headuser = this.fdataa;
    this.adharsService.updateAadhars(this.aadharsObj)
    .subscribe(res=>{
      console.log(this.aadharsObj);
      alert("Updated Successfully")

      let ref = document.getElementById('uclose')
      ref?.click();
      this.formValue.reset();
      this.getAadhars(this.fdataa);

    })
  }

  getAadhars(userid: number): void
  {
    this.adharsService.getAllAadhars(userid).subscribe(
      (res: Aadhars[]) =>{
        this.aadhars = res;
      },
      (error : HttpErrorResponse)=>{
        alert("error while loading data");
        alert(error.message);
      }
    );
  }


}
