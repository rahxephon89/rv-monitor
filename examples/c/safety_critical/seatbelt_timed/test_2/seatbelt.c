#include "../__RVC_SeatBelt_Monitor.h"
#include <stdio.h>

int main() {
	fprintf(stdout, "Test 2\n");
	fprintf(stderr, "Test 2\n");
	__RVC_SeatBelt_seatBeltAttached();
	__RVC_SeatBelt_seatBeltRemoved();
    while (1) {}
	__RVC_SeatBelt_seatBeltAttached();
}
