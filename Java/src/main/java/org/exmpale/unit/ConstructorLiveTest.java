package org.exmpale.unit;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.UUID;

/**
 * @author hzhq1255
 * @date 2022/3/10 11:01
 */
public class ConstructorLiveTest {

    protected static class Person{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Person(String name) {
            this.name = name;
        }
    }

    protected static class Son extends Person{

        public final String a;

        public Son(String name) {
            super(name);
            a = super.getName();
        }
    }

    public static void main(String[] args)  throws Exception {
        for (int i = 0; i < 10; i++){
            System.out.println(UUID.randomUUID().toString().replace("-","").substring(0,16));
        }
    }


}
