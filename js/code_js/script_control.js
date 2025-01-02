for(let i=0;i<10;i++){
    if(i%2===0){
        console.log(`${i} est pair`);
    }else{
        console.log(`${i} est impair`);
    }
}
//console.log(i);


let prenpm=["Abdel","Mickael","Nadege","Clara"];
prenpm.push("Valentin");
prenpm[2]="clement";
prenpm[9]="Nadege";
console.log(prenpm);
prenpm.forEach(prenom=>{
    console.log(prenom)
})