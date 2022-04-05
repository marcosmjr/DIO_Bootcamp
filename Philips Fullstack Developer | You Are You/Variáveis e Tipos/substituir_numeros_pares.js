function substituiPares(array){

    if(!array) return console.log("O array nulo");
    if(!array.length) return console.log("O array está vazio");
   
    for(let i = 0; i < array.length; i++){
        if(array[i] === 0  || typeof(array[i]) !== "number"){
            console.log(`O valor de indice ${i} é ${array[i]}!`);
        
        }else if(array[i] % 2 === 0){
            console.log(`Substituindo ${array[i]} por 0...`)
            array[i] = 0;
        }
    }

    return array;
}

let arr = [null, 1, 2,3,4,5,6, null, 7,8, "A", 9, 0];

console.log(substituiPares(arr));