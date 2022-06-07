function fitraPares(arr){
    return arr.filter(callback)
}

function callback(item){
    return item % 2 !== 0
}

const meuArray = [2, 34 ,243, 6, 33, 21];

console.log(fitraPares(meuArray));