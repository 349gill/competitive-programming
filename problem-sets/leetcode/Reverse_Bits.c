#include <stdint.h>>

uint32_t reverseBits(uint32_t n) {
    uint32_t r = 0;
    for (int i = 0; i < sizeof(uint32_t) * 8; i++){
        r |= (n << (sizeof(uint32_t) * 8) - 1) >> i;
        n >>= 1;
    }
    return r;
}