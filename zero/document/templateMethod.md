### 항상 목적을 알고가자 (왜 쓰는데??)

- 알고리즘을 고정시키고 특수 구현은 저수준에(하위구조) 맞긴다.

**이름을 너무 잘지었다.**

- 메소드의 템플릿(TemplateMehod)
- 특정 알고리즘을 캡슐화하여 고정시킨다(final)
- 프레임 워크에서 많이 사용된다!!!

## Jdk 예제

inputStream read()

```kotlin
public abstract class InputStream implements Closeable {
public abstract int read() throws IOException;
public int read(byte b[], int off, int len) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if (off < 0 || len < 0 || len > b.length - off) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return 0;
        }

        int c = read();
        if (c == -1) {
            return -1;
        }
        b[off] = (byte)c;

        int i = 1;
        try {
            for (; i < len ; i++) {
                c = read();
                if (c == -1) {
                    break;
                }
                b[off + i] = (byte)c;
            }
        } catch (IOException ee) {
        }
        return i;
    }
}
```
