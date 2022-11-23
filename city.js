// function changing()
// {
//     let clr=document.getElementById("color").value;
//     console.log(clr);
//     if(clr!="SELECT CITY")
//     {
//         document.body.style.backgroundColor=clr;
//     }
//     else
//     {
//         document.body.style.backgroundColor="initial";
//     }
// }
// let clr=document.getElementById("color");
// clr1.addEventListener("change",()=>{
//     let clr=document.getElementById("color").value;
//     console.log(clr);
//     if(clr!="SELECT CITY")
//     {
//         document.body.style.backgroundColor=clr;

//     }
//     else{
//         document.body.style.backgroundColor="initial";
//     }
// })
// function kDown()
// {
//     console.log("Down");
// }
// function kUp()
// {
//     console.log("Up");
// }
let parenta=document.getElementById("parent")
let child1=document.getElementsByClassName("cls");
parenta.removeChild(child1[2]);
let child_4=document.createElement("h1");
child_4.innerText="Child 4";
parenta.replaceChild(child_4,child1[1])