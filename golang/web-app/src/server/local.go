package server

import (
	"bytes"
	"encoding/json"
	"fmt"
	"net/http"
	"os"
	"time"
)

type CellData struct {
	Name        string            `json:"name"`
	Namespace   string            `json:"namespace"`
	Immutable   bool              `json:"immutable"`
	CreatedTime string            `json:"createdTime"`
	Data        map[string][]byte `json:"data"`
	StringData  map[string]string `json:"stringData"`
	BinaryData  map[string][]byte `json:"binaryData"`
}

func handler(w http.ResponseWriter, r *http.Request) {
	fmt.Println()
}

func generateTableData() {
	tableData := make([]CellData, 10)
	for i := 0; i < 10; i++ {

		cellData := CellData{
			Name: "testcm-" + fmt.Sprintf("%d", i),
			Namespace: func(a int) string {
				if a%2 == 0 {
					return "kube-system"
				}
				return "default"
			}(i),
			Immutable: func(a int) bool {
				if a%3 == 0 {
					return true
				}
				return false
			}(i),
			//Format("2006-01-02 15:04:05"),
			CreatedTime: time.Now().Format("2006-01-02 15:04:05"),
		}
		//fmt.Println(cellData)
		tableData[i] = cellData
	}
	jsonData, err := json.Marshal(tableData)
	if err != nil {
		fmt.Println(err)
	}
	//fmt.Println(string(jsonData))
	var out bytes.Buffer
	err = json.Indent(&out, jsonData, "", "  ")
	//out.WriteTo(os.Stdout)

	//fmt.Printf("\n")
	//l := make([]byte, 64)
	//out.Read(l)
	fmt.Println(out.String())
	os.WriteFile("data.json", []byte(out.String()), 0600)
}

func main() {
	generateTableData()
}
