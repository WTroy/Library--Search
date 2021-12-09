package com.sx.library.test;

import com.sx.library.test.bean.BookInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author troy
 */
@RestController
public class SearchApi {

    @GetMapping(value = "/search/{bookName}")
    public List<BookInfo> search(@PathVariable String bookName){
        BookInfo bookInfo = new BookInfo("悲惨世界", "001", "一号图书馆1号书架");
        BookInfo bookInfo1 = new BookInfo("巴黎圣母院", "002", "一号图书馆2号书架");
        BookInfo bookInfo2 = new BookInfo("艺术人生", "003", "一号图书馆3号书架");
        BookInfo bookInfo3 = new BookInfo("三体", "004", "一号图书馆4号书架");
        BookInfo bookInfo4 = new BookInfo("牧场三部曲", "005", "一号图书馆5号书架");
        BookInfo bookInfo5 = new BookInfo("红楼梦", "006", "一号图书馆6号书架");
        List<BookInfo> bookInfos = Arrays.asList(bookInfo, bookInfo1, bookInfo2, bookInfo3, bookInfo4, bookInfo5);
        return bookInfos.stream()
                .filter(e -> e.getName().contains(bookName))
                .collect(Collectors.toList());
    }
}
