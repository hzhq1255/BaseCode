// import { source, target } from "./data";
import * as jsonmergepatch from "json-merge-patch";

// 对象patch
// 原来的对象
const source = {
  metadata: {
    labels: {
      a: 'b',
      e: 'f'
    }
  }
};

// 操作后新的对象
const target = {
  metadata: {
    labels: {
      c: 'd',
      e: 'c'
    }
  }
}

const patch = jsonmergepatch.generate({}, {});

// 生成的patch 操作对象
console.log(JSON.stringify(patch, null, '\t'));
// patch 作为 payload 传参 更新对象
// k8s.apis.patch 的时候传递的对象 就是生成的patch
console.log('update source object');
console.log(JSON.stringify(jsonmergepatch.apply(source, patch), null, '\t'));

