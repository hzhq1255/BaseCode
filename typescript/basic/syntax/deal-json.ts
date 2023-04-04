import * as fs from 'fs';
const configMapList = JSON.parse(fs.readFileSync('./data.json', 'utf8'));

const items = configMapList.items;


const list = [];
let len = items.length;
for (let i = 0; i < 10; i++) {
  let index = Math.floor(Math.random() * len)
  let obj = items[index];

  delete obj.metadata.managedFields;
  list.push(items[index]);
}

fs.writeFileSync('./res.json', JSON.stringify(list, null, 2), 'utf8');



