#include <string.h>
#include "my.h"

static callback c;

int calculate_str_len(char *name) {
  (*c)("length", name); // call Java method
  return strlen(name);
}

void register_callback(callback myc) {
  c = myc;
}

int get_one() {
  return 1;
}