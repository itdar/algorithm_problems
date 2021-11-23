
def calculate_star_count(input_number, row_index):
    return abs((input_number//2 - row_index) * 2) + 1

def calculate_space_count(input_number, star_count):
    return (input_number - star_count) // 2

def draw_space(space_count):
    for j in range(0, space_count):
        print(' ', end='')

def draw_star(star_count):
    for j in range(0, star_count):
        print('*', end='')

def new_line():
    print()

if __name__ == '__main__': 
    print(" >> sandglass.py")

    input_number = 5

    for i in range(0, input_number):
        star_count = calculate_star_count(input_number, i)
        space_count = calculate_space_count(input_number, star_count)

        draw_space(space_count)
        draw_star(star_count)
        new_line()