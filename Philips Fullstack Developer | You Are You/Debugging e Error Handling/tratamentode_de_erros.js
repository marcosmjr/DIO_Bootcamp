function validaArray (arr, numero){
    try {
        
        if(!arr && !numero) throw new ReferenceError("Envie os paramentros");
        if(typeof arr !== "object") throw new TypeError("O array precisa ser do tipo object");
        if(typeof numero !== "number") throw new RangeError("O número precisa ser do tipo number");
        if(arr.length !== numero) throw new RangeError("Tamanho inválido");


    return arr;

    } catch (error) {

       if(error instanceof ReferenceError){
           console.log("Este erro é um ReferenceError!");
           console.log(error.message);
           //console.log(error.stack);
           //throw error;
       }else if(error instanceof TypeError){
            console.log("Este erro é um TypeError!");
            console.log(error.message);
       }else if(error instanceof RangeError){
            console.log("Este erro é um RangeError!");
            console.log(error.message);
       }else{
           console.log("O correu um erro não esperado: "+e);
       }
       
    }
        
}
    
   
   


console.log(validaArray([1,2,3,4,5],2));