import { V1ConfigMapCreateExample } from './data';
import request from './request';

const server: string = "8.134.114.219";

const BASE_URL : string = "";

// const k8sUrl: string = `https://${server}:30383/k8sproxy/cluster/cluster-local`;

const k8sUrl: string = `http://127.0.0.1:8001`

const createConfigMap = () => {
  const headers : any = {
    'content-type': 'application/json',
    // 'openApi': 'on',
    'Authorization': 'Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJPTm9PODJKVjVPX3ZiUncwWHFuT0lFbGw3OTlLdk9fUUI0VUhxYjFlWmZ3In0.eyJleHAiOjE2NjU5NDQ1MTIsImlhdCI6MTY2NTkxNTcxMiwianRpIjoiMTUxZjgwYWUtOGE5NC00MjE4LWJmMGMtNzM5ZWJlOWFhOTFmIiwiaXNzIjoiaHR0cHM6Ly84LjEzNC4xMTQuMjE5OjMwMzgzL2F1dGgvcmVhbG1zL2NhYXMiLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiYzMxMTU1YjUtZmVhMi00NjJmLTkzZjYtYWRlNTIzZWU3ODdmIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiYW1iYXNzYWRvciIsInNlc3Npb25fc3RhdGUiOiI5NGJmMmJiZC03MWQzLTQxNzMtYWZjZC0zZjQwNjBhMmE4NmMiLCJhY3IiOiIxIiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJkZWZhdWx0LXJvbGVzLWNhYXMiXX0sInJlc291cmNlX2FjY2VzcyI6eyJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6Im9wZW5pZCBwcm9maWxlIGVtYWlsIiwic2lkIjoiOTRiZjJiYmQtNzFkMy00MTczLWFmY2QtM2Y0MDYwYTJhODZjIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJhZG1pbiJ9.qXL_OD_kBDmSK14CplljQedty0GwbARex9NPfHIFPWUgSCCdUNloyeMjy3X4KQXqsOgb3yp4iZdu71J1W3y8xOEW-2dA6iKyYcaXm9IgVfvLHAQBRTGOnSElofJ_1D1SCsx21BcwZ84RBXNXSzQJZ74DJ07OBvIXXFGCx3mG4fKE2DUR73A2f4yTLccNUcOh3OI8leGzSdSNsNtasJ8fjJyfTifIZ_U0OFrkDtHKX_WDRumdfeAe6CpU6ZpNOOCv0cfCAviLlDpxl741RsrjFBfG_YYw0R8Exn9BFkox8w0K-SLGWGQCgRDKNoLnHb19eHeTXBE3_nadEg1khY42bQ',
  };
  const url : string =  `${k8sUrl}/api/v1/namespaces/default/configmaps`;
  // const url: string = "https://8.134.114.219:30383/k8sproxy/clusters/cluster-local/api/v1/namespaces/default/configmaps";
  console.log('url', url);
  const data : any = V1ConfigMapCreateExample;
  request(url, JSON.stringify(V1ConfigMapCreateExample), {}, 'POST', headers, BASE_URL)
    .then(res => {
      console.log(res);
    }).catch(err => {
      console.log(err);
    })

};

const getWeb = () => {
  request("http://8.134.114.219:30383/", undefined, undefined, "GET", {}, "");
}

// test crate

createConfigMap();

// getWeb();
