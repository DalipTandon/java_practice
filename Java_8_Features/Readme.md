## Java 8 Features

# Lambda expression => lambda expressions are the concise way of implementing the fucntional interfaces or anonymous classes withour creating the extra objects

## Functional interfaces => an interface with only 1 abstract methods is know as functional interface, does not matter how many static or default methods it have but it should only have single abstract method

## stream api => stream are the pipelines which process the data using various operations like filter,distinct etc and execute only when a terminal operation occurs like toList,count etc.

 # Methoda References => Method references provide a shorter way to refer to an existing method when a lambda would simply call that method.
 # Example:
 # List<String> names = List.of("Aman", "Rahul", "Priya");

 # names.forEach(System.out::println);


 # Equivalent lambda:
 # names.forEach(name -> System.out.println(name));

## Default and static methods in an interface => Java 8 allows interfaces to have methods with implementations.

## optional class => Optional<T> represents a value that may be present or absent. It can make the handling of potentially missing values more explicit.
# Optional<String> name = Optional.ofNullable(null);

# xSystem.out.println(name.orElse("Unknown")); // Unknown

## New Date and Time Api

## Collectors and groupingBy()
 # Collectors help gather stream results into useful data structures.
# Example: Group employees by city.
# Map<String, List<Employee>> employeesByCity =
#        employees.stream()
#                .collect(Collectors.groupingBy(Employee::getCity));

## Parallel Streams
# Parallel streams split stream processing into tasks that may run concurrently using the Fork/Join common pool.



















## key note 
## in java you can not directly create the object of the interface but you can create the object of the concrete class that implements the interface

