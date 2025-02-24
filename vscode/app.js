
let id =""
let name =""
let address =""
let salary = 0.0




function btnaddOnAction(){
 name = document.getElementById("name").value;
 address = document.getElementById("address").value;
 salary = document.getElementById("salary").value;

 const myHeaders = new Headers();
 myHeaders.append("Content-Type", "application/json");
 
 const raw = JSON.stringify({
   "name": name,
   "address": address,
   "salary": salary
 });
 
 const requestOptions = {
   method: "POST",
   headers: myHeaders,
   body: raw,
   redirect: "follow"
 };
 
 fetch("http://localhost:8080/customer/add", requestOptions)
   .then((response) => response.text())
   .then((result) => console.log(result))
   .catch((error) => console.error(error));
}


function btnUpdateOnAction(){

  id=  document.getElementById("id").value
  name = document.getElementById("name").value;
  address = document.getElementById("address").value;
  salary = document.getElementById("salary").value;
 

  const myHeaders = new Headers();
  myHeaders.append("Content-Type", "application/json");
  
  const raw = JSON.stringify({
    "id": id,
    "name": name,
    "address": address,
    "salary": salary
  });
  
  const requestOptions = {
    method: "PUT",
    headers: myHeaders,
    body: raw,
    redirect: "follow"
  };
  
  fetch("http://localhost:8080/customer/updateCustomer", requestOptions)
    .then((response) => response.text())
    .then((result) => console.log(result))
    .catch((error) => console.error(error));


}


function btnsearchOnAction(){

  const requestOptions = {
    method: "GET"
  };
  
  fetch("http://localhost:8080/customer/searchCustomer/"+document.getElementById("id").value, requestOptions)
  .then((response) => response.json()) 
  .then((result) => {
  
    document.getElementById("name").value = result.name;
    document.getElementById("address").value = result.address;
    document.getElementById("salary").value = result.salary;
  })
  .catch((error) => console.error(error));
}

function btnDeleteOnAction(){
id= document.getElementById("id").value;
const requestOptions = {
  method: "DELETE"
};

fetch("http://localhost:8080/customer/deleteCustomer/"+id, requestOptions)
  .then((response) => response.text())
  .then((result) => console.log(result))
  .catch((error) => console.error(error));
}