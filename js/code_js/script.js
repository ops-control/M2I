// definition d'une constante
const URL_GOOGLE="https://www.google.com";
// Declarration de variable locale
let phrase = "Salut tout le monde !";
// Declarration de variable globale
var pasbien = "ceci est une variable mal declare.";
toto();

function toto(){
    var phrase="test";
    console.log(phrase);

}

const somme=(param1,param2)=>{
    return param1+param2;
}
console.log(phrase);
console.log(somme(1,2));


//Exemlpe de bizzaer

let age =32; // number

age="te,te-deux";
console.log(age);
//changement de typage dynamique 
console.log("10"+1-2);

