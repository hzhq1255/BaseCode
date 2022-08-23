interface Configuration{
    name?: string, 
    namespace?: string, 
    immutable?: boolean,
    createdTime?: string
}

interface ConfigurationData { 
    key: string, 
    value: any, 
}

interface ConfigMap extends Configuration{
    binaryData?: ConfigurationData, 
    data?: ConfigurationData
}

interface Secret extends Configuration{ 
    stringData?: ConfigurationData, 
    data?: ConfigurationData,
}

const configmap : ConfigMap = {
    name: 'test-cm',
    namespace: 'default',
    immutable: true,
    createdTime: '2022-08-20 00:09:00',
    data: {
        key: 'foo',
        value: 'bar'
    },
    binaryData: {
        key: 'foo',
        value: 'YmFyCg=='
    },
};

console.log(configmap);