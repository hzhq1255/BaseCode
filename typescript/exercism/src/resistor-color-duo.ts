/*
Black: 0
Brown: 1
Red: 2
Orange: 3
Yellow: 4
Green: 5
Blue: 6
Violet: 7
Grey: 8
White: 9
*/
export function decodedValue(rs: string[]): number {
    // let map = new Map([
    //    ['a',1]
    // ])
    let map: Map<string, number> = new Map(Object.entries({
        black: 0,
        brown: 1,
        red: 2,
        orange: 3,
        yellow: 4,
        green: 5,
        blue: 6,
        violet: 7,
        grey: 8,
        white: 9,
    }));



    if (!rs || rs.length === 0 ) {
        return 0;
    }
    let res: number = 0;
    let value: number = 0;
    for(let i = 0; i < rs.length && i < 2; i++){
        if(map.has(rs[i]) && map.get(rs[i]) != undefined){
            value = <number> map.get(rs[i]);
            res = res * 10 + value;
        }
    }
    return res;
}


let res: number = decodedValue(['blue', 'red', 'white', 'grey']);

console.log(res);


const decodedValueFunc = (rs: string[]): number => {
    let obj = new Object({
        black: 0,
        brown: 1,
        red: 2,
        orange: 3,
        yellow: 4,
        green: 5,
        blue: 6,
        violet: 7,
        grey: 8,
        white: 9,
    });
    let s: string = '';
    for(let i: number = 0; i < rs.length && i < 2 ; i++){
        let key : keyof typeof obj = <keyof typeof obj> rs[i];
        s += `${obj[key] ?? ''}`
    }
    return isNaN(Number(s)) ? 0 : Number(s)  ;
}

console.log(decodedValueFunc(['blue', 'red', 'white', 'grey']));
