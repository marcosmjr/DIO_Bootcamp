// o que são vetores ou arrays


 //como declarar u array
 let array = ['string', 2, true];
 console.log(array);

 let array1 = [1,2,3,4,5,6];

 let array2 = ['string', 1, true, array1, ['A' ,'B', 'C', 'D'], ['array3'], ['array4']];
 console.log(array2);
 console.log(array2[3]);

//foreach
console.log(' foreach *********************************')

array2.forEach(function(item, indice){console.log('item = ', item, ' indice = ', indice)});

//push
console.log('push *************************************')

array2.push('novo item');
console.log(array2);

console.log('pop **************************************')

array2.pop();
console.log(array2);

console.log('shift ************************************');

array2.shift();
console.log(array2);

console.log('unshift ************************************');

array2.unshift('novo item no inicio');
console.log(array2);

console.log('indexOf ************************************');

let indice = array2.indexOf(true);
console.log(indice);

console.log('splice ************************************');

array2.splice(0,3); //remove do indice 0 a 3
console.log(array2);

console.log('slice ************************************');

let retorno = array2.slice(0,3);
console.log(retorno);

console.log('Objetos ************************************');
let object = {string: 'string', number: 1, Boolean: true, array: ['array'], objectInterno: {objectInterno: 'objeto interno'}}
console.log(object);
console.log('Objetos ************************************');
console.log(object.objectInterno);

console.log('Desestruturação de Objetos ************************************');
var string = object.string;
console.log(string);

var arrayInterno = object.array;
console.log(arrayInterno);

var {string, Boolean, objectInterno } = object; // recebe todo o objeto
console.log(string, Boolean, objectInterno);