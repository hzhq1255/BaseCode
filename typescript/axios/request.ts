import axios from 'axios';
// import https from 'https';



const request = (url: string,
  data: any = {},
  params: any = {},
  method: 'GET' | 'POST' | 'PATCH' | 'PUT' | 'DELETE' = 'GET',
  headers: any = {},
  baseURL: string,
  hasErrorDialog: boolean = true,
  options: object = {},) => {

  const header: object = {
    'content-type': (headers || {})['content-type'] || 'application/json',
    ...headers,
  };

  let requestQuery = {
    key: 'params',
    value: params,
  };

  switch (method) {
    case 'PATCH':
    case 'PUT':
    case 'POST':
      requestQuery.key = 'data';
      requestQuery.value = data;
      break;
    default:
      break;
  }

  return new Promise((resolve, reject) => {
    axios({
      url,
      method,
      headers: header,
      [requestQuery.key]: requestQuery.value,
      baseURL,
      ...options,
      // httpsAgent: new https.Agent({
      //   rejectUnauthorized: false
      // }),

    }).then((res: any) => {
      console.log('request res', res);
      if (res.status || res?.success) {
        resolve(res.data);
      } else {
        const reason = res?.reason ?? '未知原因';
        const err = {
          success: false,
          reason,
          errorMsg: res?.message ?? '系统异常',
          errorCode: res?.reason,
        };
        reject(err);
      }
    })
      .catch((error) => {
        console.log('request error', error);

        const responseError = error.response?.data;
        const reason = responseError?.reason ?? '未知原因';
        const err = {
          success: false,
          reason,
          errorMsg: responseError?.message ?? '系统超时',
          errorCode: responseError?.reason,
        };
        reject(err);
      });
  });
};



export default request;