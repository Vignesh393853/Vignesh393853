let numbers_arr=[10,20,30,40,50];
for(let ind in numbers_arr)
{
    console.log(ind);

}
for(let val of numbers_arr)
{
    console.log(val);
}
numbers_arr.forEach((val,ind)=>{
    console.log(val);
    console.log(ind);
})
const names_obj={
    eName:"Rose",
    eId:100,
    eLoc:"Chennai"
}
for(let ind in names_obj)
{
    console.log(ind);
}
for(let val of names_obj)
{
    console.log(val);
}