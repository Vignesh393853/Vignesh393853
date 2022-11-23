let new_elem=document.createElement("h1");
new_elem.innerHTML="new elements";
new_elem.style.color="red";
new_elem.className="new";
new_elem.classList.add("one")
new_elem.classList.remove("one");
new_elem.classList.toggle("one");
new_elem.classList.replace("one","two");
new_elem.id="three"
document.body.append(new_elem);
