function changing()
{
    let clr=document.getElementById("color").value;
    console.log(clr);
    if(clr!="select color")
    {
        document.body.style.backgroundColor=clr;
    }
    else
    {
        document.body.style.backgroundColor="initial";
    }
}

let clr=document.getElementById("color");
clr1.addEventListener("change",()=>{
    let clr=document.getElementById("color").value;
    console.log(clr);
    if(clr!="select color")
    {
        document.body.style.backgroundColor=clr;

    }
    else{
        document.body.style.backgroundColor="initial";
    }
})