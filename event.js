// function clicking()
// {
//     document.body.style.backgroundColor="blue";
//     let one=document.getElementById("new");
//     one.style.backgroundColor="red"
// }
// let event1=document.getElementById("new1");
// event1.addEventListener("click",()=>{
//     document.body.style.backgroundColor="black";
//     let one=document.getElementById("new1");
//     one.style.backgroundColor="yellow";
//})
function hoveron()
{
    let ele=document.getElementById("hover");
    ele.style.backgroundColor="blue";
    ele.style.color="yellow";
}
function hoverout()
{
    let ele=document.getElementById("hover");
    ele.style.backgroundColor="blue";
    ele.style.color="initial";
}
let ele=document.getElementById("hover1");
ele.addEventListener("mouseover",()=>{
    ele.style.backgroundColor="red";
    ele.style.color="yellow";
})
ele.addEventListener("mouseover",()=>{
    ele.style.backgroundColor="initial";
    ele.style.color="initial"
})



