package work.hzhq1255.designPattern.creation.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 上午2:40
 */
public class URLBuilder {

    private String domain;
    private String scheme;
    private String path;
    private Map<String, String> query = new HashMap<>();


    public static URLBuilder builder() {
        return new URLBuilder();
    }

    public URLBuilder domain(String domain) {
        this.domain = domain;
        return this;
    }

    public URLBuilder scheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    public URLBuilder path(String path) {
        this.path = path;
        return this;
    }

    public URLBuilder query(Map<String, String> query) {
        if (query != null) {
            this.query = query;
        }
        return this;
    }

    public String build() {
        String url = "";
        if (this.scheme != null && !"".equals(this.scheme)) {
            url = this.scheme + "://";
        }
        url += domain + path;
        List<String> params = new ArrayList<>();
        query.forEach((k, v) -> {
            params.add(k + "=" + v);
        });
        if (!query.isEmpty()) {
            url += "?" + String.join("&", params);

        }
        return url;
    }
}
