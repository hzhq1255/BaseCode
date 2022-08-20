// basic type array
let arr: number[] = [1, 2];

// 数组泛型
let arrT: Array<number> = [1, 2];

class Person {
    name: string;
    age: number;
    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }
}

let arrPeople: Array<Person> = [
    new Person('zhangsan', 22),
    new Person('lisi', 24),
];

console.log(arr);
console.log(arrT);
console.log(arrPeople);