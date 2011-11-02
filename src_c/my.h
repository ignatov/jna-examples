typedef void (*callback)(char *, char*);

int calculate_str_len(char *);

void register_callback(callback myc);

int get_one();

int get_two();