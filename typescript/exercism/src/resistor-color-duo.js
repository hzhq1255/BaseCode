"use strict";
exports.__esModule = true;
exports.decodedValue = void 0;
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
function decodedValue(rs) {
    // let map = new Map([
    //    ['a',1]
    // ])
    var map = new Map(Object.entries({
        black: 0,
        brown: 1,
        red: 2,
        orange: 3,
        yellow: 4,
        green: 5,
        blue: 6,
        violet: 7,
        grey: 8,
        white: 9
    }));
    if (!rs || rs.length === 0) {
        return 0;
    }
    var res = 0;
    var value = 0;
    for (var i = 0; i < rs.length && i < 2; i++) {
        if (map.has(rs[i]) && map.get(rs[i]) != undefined) {
            value = map.get(rs[i]);
            res = res * 10 + value;
        }
    }
    return res;
}
exports.decodedValue = decodedValue;
var res = decodedValue(['blue', 'red', 'white', 'grey']);
console.log(res);
var decodedValueFunc = function (rs) {
    var _a;
    var obj = new Object({
        black: 0,
        brown: 1,
        red: 2,
        orange: 3,
        yellow: 4,
        green: 5,
        blue: 6,
        violet: 7,
        grey: 8,
        white: 9
    });
    var s = '';
    for (var i = 0; i < rs.length && i < 2; i++) {
        var key = rs[i];
        s += "".concat((_a = obj[key]) !== null && _a !== void 0 ? _a : '');
    }
    return isNaN(Number(s)) ? 0 : Number(s);
};
console.log(decodedValueFunc(['blue', 'red', 'white', 'grey']));
