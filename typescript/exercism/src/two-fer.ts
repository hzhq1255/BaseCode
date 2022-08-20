/**
 * This stub is provided to make it straightforward to get started.
 */
/**
 * ts 类型后置
 * require retuen One for `name`, one for me
 * if missing `name` return One for you, one for me
 * @param name 
 * @returns 
 */
 export function twoFer(name: string): string {
    if (!name || name === ''){
        name = 'you';
    }
    let s: string =  `One for ${ name }, one for me`;
    return s;
  }


let strs: string[] = ['Alice','Bob','','Zaphod'];
for(let i in strs){
    console.log(twoFer(strs[i]));
}





  