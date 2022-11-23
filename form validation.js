const form=document.getElementById("form");
const username=document.getElementById("username");
const email=document.getElementById("email");
const password=document.getElementById("password");
const password2=document.getElementById("password");


form.addEventListener('submit',e=>{
    e.preventDefault();
    validateInputs();
});
const setError=(element,message)=>{
    const inputControl=element.parentElement;
    const errorDisplay=inputControl.querySelector('.error');

    errorDisplay.innerText=message;
    inputControl.classList.add('error');
inputControl.classList.remove('success');
};

const setSuccess(element)=> {
    const inputControl = element.parentElement;
    const errorDisplay = inputControl.querySelector('.error');

    errorDisplay.innerText = '';
    inputControl.classList.add('success');
    inputControl.classList.remove('error');
};
const isValidEmail =email => {
    const re =/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    return re.test(String(email).toLowerCase());
}
const validateInputs=()=>{
    const username=username.value.trim();``
    const emailvalue=email.value.trim();
    const passwordvalue=password.value.trim();
    const password2value=password2.value.trim();

    if(UsernameValue ===''){
        setError(Username,'Username is required');
    } else{
        setSuccess(username)           
    }
    if(emailvalue ===''){   x 
        setError(email,'Email is required');
    }else if (!isValidEmail(emailvalue)){
        setError(email,'provide a valid email address');
    } else {
        setSuccess(email);
    }
    if(passwordvalue ===''){
        setError(password,'Password is required');
    } else if (passwordvalue.length <8){

    } else {
        setSuccess(password);
    }
    if(password2value ===''){
        setError(password2,'Please confirm your password');
    }else if (password2value !==passwordvalue){
        setError(password2,'Password doesnt match');
    } else {
        setSuccess(password2);
    }
}












