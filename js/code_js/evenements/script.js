let clicmebutton_elem=document.getElementById("clickmebutton");
clicmebutton_elem.addEventListener("click",affi);
function affi(){
    alert("coucou !!!");
}

//
window.addEventListener("keydown",deplacerPersonnage);
function deplacerPersonnage(event){
    switch(event.keyCode){
        case 37 : 
            console.log("je vais vers la gauche");
            break;
        case 38 : 
            console.log("je vais vers haut");
            break;
        case 39 : 
            console.log("je vais vers la droite");
            break;  
            case 39 : 
            console.log("je vais vers la bas");
            break;                  
    }    
}


let saisie_elem= document.getElementById("saisie");
let recopie_elem=document.getElementById("recopie");

saisie_elem.addEventListener("input", actu);
function actu(){
    recopie_elem.innerHTML=saisie_elem.value;
}


choixcouleur.addEventListener("input",changerCouleur);
function changerCouleur(){
    document.body.className="";

    document.body.classList.add(choixcouleur.value);
}