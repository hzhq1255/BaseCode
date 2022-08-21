
let obj: object = {
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
};
let map: Map<string, number> = new Map(Object.entries(obj));

// 1 欧姆
const ohms = 'ohms';
// 1 千欧姆
const kiloohms = 'kiloohms';

/**
 * 
 * @param rs with blue white grey...
 * @returns 33 ohms
 */
export function decodedResistorValue(rs: string[]): string {
    let res: number = 0;
    let unit: string = ohms;
    for (let i: number = 0; i < rs.length && i < 3; i++) {
        let value: number = Number(map.get(rs[i])) || 0;
        if (i === 2) {
            let powCount: number = value;
            // if (value >= 3) {
            //     powCount = value - 3;
            //     unit = kiloohms;
            // } 
            res = res * Math.pow(10, powCount);
            if (res % 1000 === 0) {
                unit = kiloohms;
                res = Number((res / 1000).toFixed(0));
            }
            break;
        }
        res = res * 10 + value;
    }
    return `${res} ${unit}`;
}

export const decodedResistorValueFunc = (rs: string[]): string => {
    let key: keyof typeof obj;
    let res : string = '';
    let unit: string = ohms;
    let zeroCount: number = 0;
    for(let i: number = 0; i < rs.length && i < 3; i++){
        key = rs[i] as keyof typeof obj;
        if(i === 2){
            let value: number = obj[key];
            for(let i: number = 0; i < value; i++){
                res =  res.concat('0');
                zeroCount++;
            }
            if(zeroCount >= 3){
                unit = kiloohms;
                res =  res.substring(0, res.length - 3);
            }
            break;
        }
        if(obj[key] === 0){
            zeroCount++;
        } else {
            zeroCount = 0;
        }
        res = res.concat(obj[key]);
    }
    return `${res} ${unit}`;
}




function test() {
    let rsArr: Array<string[]> = new Array(
        ['orange', 'orange', 'black'],
        ['orange', 'orange', 'brown'],
        ['orange', 'orange', 'red'],
        ['orange', 'orange', 'orange'],
        ['red', 'black', 'red'],
    );

    rsArr.forEach((v, i) => {
        //console.log(decodedResistorValue(v));
        console.log(decodedResistorValueFunc(v));
    });
}

test();