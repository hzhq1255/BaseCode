import * as fs from 'fs';
import * as YAML from 'js-yaml';
// import { join } from 'path';
const yamlString = fs.readFileSync('a.txt', 'utf8');
const b = new Blob([yamlString]);
console.log(b.size)


// console.log(yamlString);
// encodeURIComponent(yamlString)
// const url = "http://192.168.0.228:8080/clusters/01b0364d-1fd7-46fe-9271-7b6a0c138cc5/yaml/verification?authType=1&yamlContent="+encodeURIComponent(yamlString);
// console.log(url)


// fs.writeFileSync("b.txt", encodeURIComponent(yamlString))
// fs.writeFileSync("a.txt", url)

// const json: any = JSON.parse(fs.readFileSync('/Users/hzhq/Downloads/long_text_2022-12-16-16-56-43.txt', 'utf-8'))
// console.log(json)
// const doc = YAML.load(json.data)
// console.log(doc)

// fs.writeFileSync('a.yaml', YAML.dump(doc),'utf-8')