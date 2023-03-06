import * as jsonmergepatch from "json-merge-patch";

const source = {
  labels: {
    a: "v"
  },
  containers: [
    {
      "name": "myapp"
    },
    {
      "name": "myapp1"
    }
  ]
};

const target = {
  labels: {
    a: "c"
  },
  containers: [
    {
      "name": "myapp"
    },
    {
      "name": "myaaaapp1"
    }
  ]
};

// 数组只能全量更新
const patch = jsonmergepatch.generate(source, target);

// 生成的patch 操作对象
console.log(JSON.stringify(patch, null, '\t'));
// patch 作为 payload 传参 更新对象
// k8s.apis.patch 的时候传递的对象 就是生成的patch
console.log('update source object');
console.log(JSON.stringify(jsonmergepatch.apply(source, patch), null, '\t'));



