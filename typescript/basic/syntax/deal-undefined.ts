// ?:
function questionMarkAndColon(x: number, y?: number): number { // 可选参数为参数自动加上 undefined
    return x + (y || 0);
}
let n: number = 0;
n = questionMarkAndColon(1); // 1
console.log(n);
//questionMarkAndColon(1, null) error, 'null' is not assignable to 'number | undefined'
questionMarkAndColon(1, undefined)  
console.log(n);
// 接口定义
interface IExample1 {
    id: string | number,
    page: number,
    key?: string,
}
console.log('-------------------------------')

// ?? 与 || 类似 但是 || 会排除 0 ?? 不会
console.log(null || 3);
console.log(null ?? 3);
console.log(undefined || 2);
console.log(undefined ?? 2);
console.log(0 || 2);
console.log(0 ?? 2);

// ?. 和 && 基本一致 a ?. b 相当于 a && a.b ? a.b : undefined 方便取 data 数据
const obj = {
    a: {
        b: {
            d: 1,
            e: undefined
        },
        c: null
    }
}

console.log('-----------------------');

import * as fs from 'fs';
try {
    const data = JSON.parse(fs.readFileSync('./data.json', 'utf8'));
    const obj = Object.assign({}, data);
    console.log(obj?.a?.b);
    console.log(obj?.a?.c);
} catch(err) {
    console.log(err);
}




