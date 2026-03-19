package chapter17_added_features.pattern_matching_with_records;

public record Id(int idNum, Type type) {
	enum Type{FULL_TIME,PART_TIME};
}
