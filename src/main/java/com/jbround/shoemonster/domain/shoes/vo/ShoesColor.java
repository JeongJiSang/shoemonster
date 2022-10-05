package com.jbround.shoemonster.domain.shoes.vo;

/**
 * Created by jsjeong on 2022. 10. 05.
 * <pre>
 *  신발 색상
 * </pre>
 */
public class ShoesColor {

    private final int red;
    private final int green;
    private final int blue;

    public ShoesColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public ShoesColor getList() {
       return new ShoesColor(red, green, blue);
    }

}
