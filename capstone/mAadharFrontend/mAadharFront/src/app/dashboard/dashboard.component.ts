import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Aadhars } from './aadhars';
import { AadharsService } from './aadhars.service';
import { LoginService } from '../login.service';
import { FormBuilder, FormGroup, FormControl } from '@angular/forms';



@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  public aadhars : Aadhars[];
  formValue : FormGroup;
  aadharsObj : Aadhars = new Aadhars();
  aadharsData : any;
  fdataa: number;
  constructor(private formBuilder: FormBuilder,private http: HttpClient, private adharsService : AadharsService, private loginService:LoginService) { }
  
 
  
  ngOnInit() {
  let dataa = localStorage.getItem('userid');
  if(dataa!=null)
   this.fdataa = parseInt(dataa);
   console.log(this.fdataa);
    this.getAadhars(this.fdataa);
    this.formValue = this.formBuilder.group({
      name: [''],
      gender: [''],
      dob: [''],
      address: [''],
      email: [''],
      mobile: [''],
      headuser: [this.fdataa]

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

  addAadhar(): void
  {
    console.log(this.aadharsObj);
    this.aadharsObj.name = this.formValue.value.name;
    this.aadharsObj.gender = this.formValue.value.gender;
    this.aadharsObj.dob = this.formValue.value.dob;
    this.aadharsObj.address = this.formValue.value.address;
    this.aadharsObj.email = this.formValue.value.email;
    this.aadharsObj.mobile = this.formValue.value.mobile;
    this.aadharsObj.headuser = this.fdataa;
    this.adharsService.addAadhars(this.aadharsObj)
    .subscribe(res=>{
      console.log(res);
      let ref = document.getElementById("close");
      ref?.click();
      this.formValue.reset();
      this.getAadhars(this.fdataa);
    }, err=>{
  
    console.log(err);
  });
  this.getAadhars(this.fdataa);
}

  deleteAadhar(aadhars : any){
    this.adharsService.deleteAadhars(aadhars.id)
    .subscribe(res=>{
      alert("Aadhar Deleted");
      this.getAadhars(this.fdataa);
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



  
    

}
