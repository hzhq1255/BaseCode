let x: [string, number];
x = ['hello', 2]; // running normal
// 类型需要一致
// running error
// x = [1, 'hello']; 
console.log(x[0]);