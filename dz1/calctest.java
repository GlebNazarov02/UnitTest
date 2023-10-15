package dz1;
import static org.assertj.core.api.Assertions.*;

public class calctest {
    public static void main(String[] args) {
        
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
        assertThatThrownBy(() ->
                         Calculator.calculation(8, 4, '_')
                ).isInstanceOf(IllegalStateException.class);  
        assertThat(Calculator.calculateDiscount(100,100)).isEqualTo(0.0);
        assertThat(Calculator.calculateDiscount(100,50)).isEqualTo(50.0);
        assertThat(Calculator.calculateDiscount(100,0)).isEqualTo(100.0);
        assertThatThrownBy(()->Calculator.calculateDiscount(-1, 10)).isInstanceOf(RuntimeException.class);
        assertThatThrownBy(()->Calculator.calculateDiscount(0, 10)).isInstanceOf(RuntimeException.class);
        assertThatThrownBy(()->Calculator.calculateDiscount(100, -10)).isInstanceOf(RuntimeException.class);
        assertThatThrownBy(()->Calculator.calculateDiscount(100, 101)).isInstanceOf(RuntimeException.class);
}
}