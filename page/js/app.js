const about_txt = document.querySelector(".about_txt");
const name_txt = document.querySelector(".name_txt");
const age_txt = document.querySelector(".age_txt");

setTimeout(()=> {
    about_txt.classList.add("reset_txt");
    name_txt.classList.add("reset_txt");
    age_txt.classList.add("reset_txt")
}, 500)
