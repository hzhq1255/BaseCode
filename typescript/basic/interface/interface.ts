interface Configuration {
    name?: string;
    namespace?: string;
    immutable?: boolean;
    createdTime?: string;
  }
  
  export interface ConfigurationData {
    key: string;
    value: any;
  }
  
  export interface ConfigMap extends Configuration {
    binaryData?: Array<ConfigurationData>;
    data?: Array<ConfigurationData>;
  }
  
  export interface Secret extends Configuration {
    stringData?: Array<ConfigurationData>;
    data?: Array<ConfigurationData>;
  }
  
  interface V1ConfigMap {
    apiVersion: string;
    kind: string;
    metadata?: Map<string, any>;
    data?: Map<string, string>;
    binaryData?: Map<string, string>;
    immutable?: boolean;
  }
  
  interface V1Secret {
      apiVersion: string;
      kind: string;
      metadata?: Map<string, any>;
      data?: Map<string, string>;
      stringData?: Map<string, string>;
      immutable?: boolean;
  }
  
  const mapToObjArray = (map: Map<string, any>): Array<ConfigurationData> =>{
      let objArray = new Array<ConfigurationData>;
      map.forEach((value, key) =>{
          objArray.push({
              key: key,
              value: value
          });
      });
      return objArray;
  };
  
  function convertConfigMap(v1ConfigMap: Required<V1ConfigMap>): ConfigMap{
      return {
          name: v1ConfigMap?.metadata?.get('name') ?? '/',
          namespace: v1ConfigMap?.metadata.get('namespace') ?? '/',
          immutable: v1ConfigMap?.immutable ?? false,
          createdTime: v1ConfigMap?.metadata.get('creationTimestamp') ?? '/',
          data: mapToObjArray(v1ConfigMap?.data) ?? [],
          binaryData: mapToObjArray(v1ConfigMap?.binaryData) ?? [],
      }
  }
  
  function convertV1Secret(v1Secret: Required<V1Secret>): Secret{
      return {
          name: v1Secret?.metadata?.get('name') ?? '/',
          namespace: v1Secret?.metadata.get('namespace') ?? '/',
          immutable: v1Secret?.immutable ?? false,
          createdTime: v1Secret?.metadata.get('creationTimestamp') ?? '/',
          data: mapToObjArray(v1Secret?.data) ?? [],
          stringData: mapToObjArray(v1Secret?.stringData) ?? [],
      }
  }
  
   const generateConfigMapList = (): Array<ConfigMap>=>{ 
      let configMapList: Array<ConfigMap> = [];
      for (let i: number = 0; i < 10; i++){
          configMapList.push({ 
              name: `testcm-${i}`, 
              namespace: i % 2 === 0 ? 'kube-system': 'default',
              immutable: i % 3 === 0 ? false : true,
              createdTime: (()=>{
                  let date: Date = new Date();
                  let Y: string = date.getFullYear() + '-';
                  let M: string = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1):date.getMonth()+1) + '-';
                  let D: string = (date.getDate()< 10 ? '0'+date.getDate():date.getDate())+ ' ';
                  let h: string = (date.getHours() < 10 ? '0'+date.getHours():date.getHours())+ ':';
                  let m: string = (date.getMinutes() < 10 ? '0'+date.getMinutes():date.getMinutes()) + ':';
                  let s: string = (date.getSeconds() < 10 ? '0'+date.getSeconds():date.getSeconds() + '');
                  return Y+M+D+h+m+s;
              })(),
              data: ((): ConfigurationData[] => {
                  if (i % 2 === 0) {
                      return [{ key: "a", value:"b"}]
                  }
                  return []
              })(),
          });
      }
      return configMapList;
  }
  
  console.log(generateConfigMapList());