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
console.log(null || 3); // 3
console.log(null ?? 3); // 3
console.log(undefined || 2); // 2 
console.log(undefined ?? 2); // 2
console.log(0 || 2); // 2
console.log(0 ?? 2); // 0


console.log('-------------------------------');

import * as fs from 'fs';
/*
{
    "a": {
        "b": "c"
    }
}
*/
// ?. 和 && 基本一致 a ?. b 相当于 a && a.b ? a.b : undefined 方便取 data 数据 

function questionMarkAndPoint(){
    try {
        const data = JSON.parse(fs.readFileSync('./data.json', 'utf8'));
        const obj = Object.assign({}, data);
        console.log(obj?.a?.b); // c
        console.log(obj?.a?.c); // undefined
        console.log(obj?.a?.b?.c); // undefined
    } catch(err) {
        console.log(err);
    }

}


console.log('-------------------------------');
// !. 的意思是断言，告诉 ts 该对象里一定有某个值
function assertValue(){
    let map: Map<string, any> = new Map([
        ['a', {
            name: 'a'
        }],
        ['b', {
            name: 'b'
        }],
    ]);
    const value: string = map.get('a')!.name;
    console.log(value);
}
assertValue();


