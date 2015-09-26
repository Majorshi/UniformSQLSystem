// Generated from uniformSQL.g4 by ANTLR 4.5
package cn.edu.bit.linc.zql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class uniformSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUE=1, FALSE=2, ALL=3, NOT=4, LIKE=5, CHARACTER=6, IF=7, EXISTS=8, ASC=9, 
		DESC=10, ORDER=11, GROUP=12, BY=13, HAVING=14, WHERE=15, FROM=16, AS=17, 
		SELECT=18, DISTINCT=19, INSERT=20, OVERWRITE=21, OUTER=22, UNIQUEJOIN=23, 
		PRESERVE=24, JOIN=25, LEFT=26, RIGHT=27, FULL=28, ON=29, PARTITION=30, 
		PARTITIONS=31, TABLE=32, TABLES=33, COLUMNS=34, INDEX=35, INDEXES=36, 
		REBUILD=37, FUNCTIONS=38, SHOW=39, MSCK=40, REPAIR=41, DIRECTORY=42, LOCAL=43, 
		TRANSFORM=44, USING=45, CLUSTER=46, DISTRIBUTE=47, SORT=48, UNION=49, 
		LOAD=50, EXPORT=51, IMPORT=52, DATA=53, INPATH=54, IS=55, NULL=56, CREATE=57, 
		EXTERNAL=58, ALTER=59, CHANGE=60, COLUMN=61, FIRST=62, AFTER=63, DESCRIBE=64, 
		DROP=65, RENAME=66, IGNORE=67, PROTECTION=68, TO=69, COMMENT=70, BOOLEAN=71, 
		TINYINT=72, SMALLINT=73, INT=74, BIGINT=75, FLOAT=76, DOUBLE=77, DATE=78, 
		DATETIME=79, TIMESTAMP=80, DECIMAL=81, STRING=82, VARCHAR=83, ARRAY=84, 
		STRUCT=85, MAP=86, UNIONTYPE=87, REDUCE=88, PARTITIONED=89, CLUSTERED=90, 
		SORTED=91, INTO=92, BUCKETS=93, ROW=94, ROWS=95, FORMAT=96, DELIMITED=97, 
		FIELDS=98, TERMINATED=99, ESCAPED=100, COLLECTION=101, ITEMS=102, KEYS=103, 
		KEY=104, LINES=105, STORED=106, FILEFORMAT=107, SEQUENCEFILE=108, TEXTFILE=109, 
		RCFILE=110, ORCFILE=111, INPUTFORMAT=112, OUTPUTFORMAT=113, INPUTDRIVER=114, 
		OUTPUTDRIVER=115, OFFLINE=116, ENABLE=117, DEFAULT=118, DISABLE=119, READONLY=120, 
		LOCATION=121, TABLESAMPLE=122, BUCKET=123, OUT=124, OF=125, PERCENT=126, 
		CAST=127, ADD=128, REPLACE=129, RLIKE=130, REGEXP=131, TEMPORARY=132, 
		FUNCTION=133, MACRO=134, EXPLAIN=135, EXTENDED=136, FORMATTED=137, PRETTY=138, 
		DEPENDENCY=139, LOGICAL=140, SERDE=141, WITH=142, DEFERRED=143, SERDEPROPERTIES=144, 
		DBPROPERTIES=145, LIMIT=146, SET=147, UNSET=148, TBLPROPERTIES=149, IDXPROPERTIES=150, 
		CASCADED=151, CASE=152, WHEN=153, THEN=154, ELSE=155, END=156, MAPJOIN=157, 
		STREAMTABLE=158, CLUSTERSTATUS=159, UTC=160, LONG=161, DELETE=162, FETCH=163, 
		INTERSECT=164, VIEW=165, IN=166, DATABASE=167, DATABASES=168, MATERIALIZED=169, 
		SCHEMA=170, SCHEMAS=171, GRANT=172, REVOKE=173, SSL=174, UNDO=175, LOCK=176, 
		LOCKS=177, UNLOCK=178, SHARED=179, EXCLUSIVE=180, PROCEDURE=181, UNSIGNED=182, 
		WHILE=183, READ=184, READS=185, PURGE=186, RANGE=187, ANALYZE=188, BEFORE=189, 
		BETWEEN=190, BOTH=191, BINARY=192, CROSS=193, CONTINUE=194, CURSOR=195, 
		TRIGGER=196, RECORDREADER=197, RECORDWRITER=198, LATERAL=199, TOUCH=200, 
		ARCHIVE=201, UNARCHIVE=202, COMPUTE=203, STATISTICS=204, USE=205, OPTION=206, 
		CONCATENATE=207, UPDATE=208, RESTRICT=209, CASCADE=210, SKEWED=211, ROLLUP=212, 
		CUBE=213, DIRECTORIES=214, FOR=215, WINDOW=216, UNBOUNDED=217, PRECEDING=218, 
		FOLLOWING=219, CURRENT=220, LESS=221, MORE=222, OVER=223, GROUPING=224, 
		SETS=225, TRUNCATE=226, NOSCAN=227, PARTIALSCAN=228, USER=229, ROLE=230, 
		INNER=231, EXCHANGE=232, IDENTIFIED=233, CHAR=234, ABS=235, ACOS=236, 
		ASIN=237, ATAN=238, CEIL=239, COS=240, COT=241, EXP=242, FLOOR=243, LN=244, 
		POW=245, RAND=246, ROUND=247, SIN=248, SQRT=249, TAN=250, LCASE=251, LOWER=252, 
		LTRIM=253, RTRIM=254, CONCAT=255, SUBSTR=256, TRIM=257, UCASE=258, UPPER=259, 
		INTERVAL=260, TO_DATE=261, DAY=262, HOUR=263, MINUTE=264, MONTH=265, SECOND=266, 
		FROM_UNIXTIME=267, YEAR=268, DATE_ADD=269, DATE_SUB=270, COLLATE=271, 
		AVG=272, COUNT=273, MAX=274, MIN=275, SUM=276, COALESCE=277, DUPLICATE=278, 
		SERVER=279, ALIASES=280, ALIAS=281, VALUES=282, VALUE=283, LOW_PRIORITY=284, 
		HIGH_PRIORITY=285, HASH=286, REFERENCES=287, TO_CHAR=288, DATE_FORMAT=289, 
		SIGNED=290, INTEGER=291, LENGTH=292, REVERSE=293, IFNULL=294, HEX=295, 
		CONV=296, DIVIDE=297, MOD=298, OR=299, AND=300, XOR=301, ARROW=302, EQ=303, 
		NOT_EQ=304, LET=305, GET=306, SET_VAR=307, SHIFT_LEFT=308, SHIFT_RIGHT=309, 
		SEMI=310, COLON=311, DOT=312, COMMA=313, ASTERISK=314, RPAREN=315, LPAREN=316, 
		RBRACK=317, LBRACK=318, PLUS=319, MINUS=320, NEGATION=321, VERTBAR=322, 
		BITAND=323, POWER_OP=324, GTH=325, LTH=326, Double_Quote=327, INTEGER_NUM=328, 
		VARCHAR_NUM=329, BINARY_NUM=330, HEX_DIGIT=331, REAL_NUMBER=332, TEXT_STRING=333, 
		ID=334, LINE_COMMENT=335, BLOCK_COMMENT=336, WHITE_SPACE=337, SL_COMMENT=338, 
		Regex_Escaped_Unicode=339;
	public static final int
		RULE_keyword = 0, RULE_delimited_statement = 1, RULE_integer_types = 2, 
		RULE_relational_op = 3, RULE_cast_data_type = 4, RULE_interval_unit = 5, 
		RULE_string_literal = 6, RULE_number_literal = 7, RULE_hex_literal = 8, 
		RULE_boolean_literal = 9, RULE_literal_value = 10, RULE_functionList = 11, 
		RULE_number_functions = 12, RULE_char_functions = 13, RULE_time_functions = 14, 
		RULE_other_functions = 15, RULE_group_functions = 16, RULE_schema_name = 17, 
		RULE_database_name = 18, RULE_table_name = 19, RULE_engine_name = 20, 
		RULE_column_name = 21, RULE_view_name = 22, RULE_parser_name = 23, RULE_index_name = 24, 
		RULE_partition_name = 25, RULE_partition_logical_name = 26, RULE_constraintbol_name = 27, 
		RULE_foreign_keybol_name = 28, RULE_collation_name = 29, RULE_event_name = 30, 
		RULE_user_name = 31, RULE_function_name = 32, RULE_procedure_name = 33, 
		RULE_server_name = 34, RULE_wrapper_name = 35, RULE_alias = 36, RULE_password = 37, 
		RULE_server_alias_name = 38, RULE_role_name = 39, RULE_group_name = 40, 
		RULE_principal_name = 41, RULE_any_name = 42, RULE_priv_type = 43, RULE_expression = 44, 
		RULE_exp_factor1 = 45, RULE_exp_factor2 = 46, RULE_exp_factor3 = 47, RULE_exp_factor4 = 48, 
		RULE_bool_primary = 49, RULE_predicate = 50, RULE_bit_expr = 51, RULE_factor1 = 52, 
		RULE_factor2 = 53, RULE_factor3 = 54, RULE_factor4 = 55, RULE_factor5 = 56, 
		RULE_factor6 = 57, RULE_factor7 = 58, RULE_simple_expr = 59, RULE_function_call = 60, 
		RULE_case_when_statement = 61, RULE_case_when_statement1 = 62, RULE_case_when_statement2 = 63, 
		RULE_column_spec = 64, RULE_raw_expression_list = 65, RULE_expression_list = 66, 
		RULE_interval_expr = 67, RULE_table_references = 68, RULE_table_reference = 69, 
		RULE_table_factor1 = 70, RULE_table_factor2 = 71, RULE_table_factor3 = 72, 
		RULE_table_atom = 73, RULE_join_condition = 74, RULE_index_hint_list = 75, 
		RULE_index_options = 76, RULE_index_hint = 77, RULE_index_list = 78, RULE_partition_clause = 79, 
		RULE_partition_names = 80, RULE_root_statement = 81, RULE_data_manipulation_statements = 82, 
		RULE_data_definition_statements = 83, RULE_create_statement = 84, RULE_drop_statement = 85, 
		RULE_privilege_alter_statement = 86, RULE_select_statement = 87, RULE_select_expression = 88, 
		RULE_where_clause = 89, RULE_groupby_clause = 90, RULE_groupby_item = 91, 
		RULE_having_clause = 92, RULE_orderby_clause = 93, RULE_orderby_item = 94, 
		RULE_limit_clause = 95, RULE_offset = 96, RULE_row_count = 97, RULE_select_list = 98, 
		RULE_column_list = 99, RULE_subquery = 100, RULE_table_spec = 101, RULE_displayed_column = 102, 
		RULE_insert_statement = 103, RULE_insert_header = 104, RULE_value_list_clause = 105, 
		RULE_column_value_list = 106, RULE_set_columns_cluase = 107, RULE_set_column_cluase = 108, 
		RULE_create_database_statement = 109, RULE_create_table_statement = 110, 
		RULE_create_table_statement1 = 111, RULE_create_table_statement2 = 112, 
		RULE_create_definition = 113, RULE_column_definition = 114, RULE_null_or_notnull = 115, 
		RULE_column_data_type_header = 116, RULE_index_column_name = 117, RULE_length = 118, 
		RULE_varchar_length = 119, RULE_binary_length = 120, RULE_alter_table_statement = 121, 
		RULE_alter_table_specification = 122, RULE_index_column_names = 123, RULE_index_type = 124, 
		RULE_index_option = 125, RULE_column_definitions = 126, RULE_rename_table_statement = 127, 
		RULE_drop_database_statement = 128, RULE_drop_table_statement = 129, RULE_drop_view_statement = 130, 
		RULE_drop_user_statement = 131, RULE_create_view_statement = 132, RULE_create_view_body = 133, 
		RULE_alter_view_statement = 134, RULE_create_user_statement = 135, RULE_grant_privilege_statement = 136, 
		RULE_principal_specification = 137, RULE_revoke_privilege_statement = 138, 
		RULE_show_event_statement = 139, RULE_show_specification = 140, RULE_set_event_statement = 141, 
		RULE_use_event_statement = 142, RULE_server_event_statement = 143, RULE_update_statements = 144, 
		RULE_delete_statements = 145;
	public static final String[] ruleNames = {
		"keyword", "delimited_statement", "integer_types", "relational_op", "cast_data_type", 
		"interval_unit", "string_literal", "number_literal", "hex_literal", "boolean_literal", 
		"literal_value", "functionList", "number_functions", "char_functions", 
		"time_functions", "other_functions", "group_functions", "schema_name", 
		"database_name", "table_name", "engine_name", "column_name", "view_name", 
		"parser_name", "index_name", "partition_name", "partition_logical_name", 
		"constraintbol_name", "foreign_keybol_name", "collation_name", "event_name", 
		"user_name", "function_name", "procedure_name", "server_name", "wrapper_name", 
		"alias", "password", "server_alias_name", "role_name", "group_name", "principal_name", 
		"any_name", "priv_type", "expression", "exp_factor1", "exp_factor2", "exp_factor3", 
		"exp_factor4", "bool_primary", "predicate", "bit_expr", "factor1", "factor2", 
		"factor3", "factor4", "factor5", "factor6", "factor7", "simple_expr", 
		"function_call", "case_when_statement", "case_when_statement1", "case_when_statement2", 
		"column_spec", "raw_expression_list", "expression_list", "interval_expr", 
		"table_references", "table_reference", "table_factor1", "table_factor2", 
		"table_factor3", "table_atom", "join_condition", "index_hint_list", "index_options", 
		"index_hint", "index_list", "partition_clause", "partition_names", "root_statement", 
		"data_manipulation_statements", "data_definition_statements", "create_statement", 
		"drop_statement", "privilege_alter_statement", "select_statement", "select_expression", 
		"where_clause", "groupby_clause", "groupby_item", "having_clause", "orderby_clause", 
		"orderby_item", "limit_clause", "offset", "row_count", "select_list", 
		"column_list", "subquery", "table_spec", "displayed_column", "insert_statement", 
		"insert_header", "value_list_clause", "column_value_list", "set_columns_cluase", 
		"set_column_cluase", "create_database_statement", "create_table_statement", 
		"create_table_statement1", "create_table_statement2", "create_definition", 
		"column_definition", "null_or_notnull", "column_data_type_header", "index_column_name", 
		"length", "varchar_length", "binary_length", "alter_table_statement", 
		"alter_table_specification", "index_column_names", "index_type", "index_option", 
		"column_definitions", "rename_table_statement", "drop_database_statement", 
		"drop_table_statement", "drop_view_statement", "drop_user_statement", 
		"create_view_statement", "create_view_body", "alter_view_statement", "create_user_statement", 
		"grant_privilege_statement", "principal_specification", "revoke_privilege_statement", 
		"show_event_statement", "show_specification", "set_event_statement", "use_event_statement", 
		"server_event_statement", "update_statements", "delete_statements"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'=>'", null, null, "'<='", "'>='", "':='", "'<<'", "'>>'", 
		"';'", "':'", "'.'", "','", "'*'", "')'", "'('", "']'", "'['", "'+'", 
		"'-'", "'~'", "'|'", "'&'", "'^'", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TRUE", "FALSE", "ALL", "NOT", "LIKE", "CHARACTER", "IF", "EXISTS", 
		"ASC", "DESC", "ORDER", "GROUP", "BY", "HAVING", "WHERE", "FROM", "AS", 
		"SELECT", "DISTINCT", "INSERT", "OVERWRITE", "OUTER", "UNIQUEJOIN", "PRESERVE", 
		"JOIN", "LEFT", "RIGHT", "FULL", "ON", "PARTITION", "PARTITIONS", "TABLE", 
		"TABLES", "COLUMNS", "INDEX", "INDEXES", "REBUILD", "FUNCTIONS", "SHOW", 
		"MSCK", "REPAIR", "DIRECTORY", "LOCAL", "TRANSFORM", "USING", "CLUSTER", 
		"DISTRIBUTE", "SORT", "UNION", "LOAD", "EXPORT", "IMPORT", "DATA", "INPATH", 
		"IS", "NULL", "CREATE", "EXTERNAL", "ALTER", "CHANGE", "COLUMN", "FIRST", 
		"AFTER", "DESCRIBE", "DROP", "RENAME", "IGNORE", "PROTECTION", "TO", "COMMENT", 
		"BOOLEAN", "TINYINT", "SMALLINT", "INT", "BIGINT", "FLOAT", "DOUBLE", 
		"DATE", "DATETIME", "TIMESTAMP", "DECIMAL", "STRING", "VARCHAR", "ARRAY", 
		"STRUCT", "MAP", "UNIONTYPE", "REDUCE", "PARTITIONED", "CLUSTERED", "SORTED", 
		"INTO", "BUCKETS", "ROW", "ROWS", "FORMAT", "DELIMITED", "FIELDS", "TERMINATED", 
		"ESCAPED", "COLLECTION", "ITEMS", "KEYS", "KEY", "LINES", "STORED", "FILEFORMAT", 
		"SEQUENCEFILE", "TEXTFILE", "RCFILE", "ORCFILE", "INPUTFORMAT", "OUTPUTFORMAT", 
		"INPUTDRIVER", "OUTPUTDRIVER", "OFFLINE", "ENABLE", "DEFAULT", "DISABLE", 
		"READONLY", "LOCATION", "TABLESAMPLE", "BUCKET", "OUT", "OF", "PERCENT", 
		"CAST", "ADD", "REPLACE", "RLIKE", "REGEXP", "TEMPORARY", "FUNCTION", 
		"MACRO", "EXPLAIN", "EXTENDED", "FORMATTED", "PRETTY", "DEPENDENCY", "LOGICAL", 
		"SERDE", "WITH", "DEFERRED", "SERDEPROPERTIES", "DBPROPERTIES", "LIMIT", 
		"SET", "UNSET", "TBLPROPERTIES", "IDXPROPERTIES", "CASCADED", "CASE", 
		"WHEN", "THEN", "ELSE", "END", "MAPJOIN", "STREAMTABLE", "CLUSTERSTATUS", 
		"UTC", "LONG", "DELETE", "FETCH", "INTERSECT", "VIEW", "IN", "DATABASE", 
		"DATABASES", "MATERIALIZED", "SCHEMA", "SCHEMAS", "GRANT", "REVOKE", "SSL", 
		"UNDO", "LOCK", "LOCKS", "UNLOCK", "SHARED", "EXCLUSIVE", "PROCEDURE", 
		"UNSIGNED", "WHILE", "READ", "READS", "PURGE", "RANGE", "ANALYZE", "BEFORE", 
		"BETWEEN", "BOTH", "BINARY", "CROSS", "CONTINUE", "CURSOR", "TRIGGER", 
		"RECORDREADER", "RECORDWRITER", "LATERAL", "TOUCH", "ARCHIVE", "UNARCHIVE", 
		"COMPUTE", "STATISTICS", "USE", "OPTION", "CONCATENATE", "UPDATE", "RESTRICT", 
		"CASCADE", "SKEWED", "ROLLUP", "CUBE", "DIRECTORIES", "FOR", "WINDOW", 
		"UNBOUNDED", "PRECEDING", "FOLLOWING", "CURRENT", "LESS", "MORE", "OVER", 
		"GROUPING", "SETS", "TRUNCATE", "NOSCAN", "PARTIALSCAN", "USER", "ROLE", 
		"INNER", "EXCHANGE", "IDENTIFIED", "CHAR", "ABS", "ACOS", "ASIN", "ATAN", 
		"CEIL", "COS", "COT", "EXP", "FLOOR", "LN", "POW", "RAND", "ROUND", "SIN", 
		"SQRT", "TAN", "LCASE", "LOWER", "LTRIM", "RTRIM", "CONCAT", "SUBSTR", 
		"TRIM", "UCASE", "UPPER", "INTERVAL", "TO_DATE", "DAY", "HOUR", "MINUTE", 
		"MONTH", "SECOND", "FROM_UNIXTIME", "YEAR", "DATE_ADD", "DATE_SUB", "COLLATE", 
		"AVG", "COUNT", "MAX", "MIN", "SUM", "COALESCE", "DUPLICATE", "SERVER", 
		"ALIASES", "ALIAS", "VALUES", "VALUE", "LOW_PRIORITY", "HIGH_PRIORITY", 
		"HASH", "REFERENCES", "TO_CHAR", "DATE_FORMAT", "SIGNED", "INTEGER", "LENGTH", 
		"REVERSE", "IFNULL", "HEX", "CONV", "DIVIDE", "MOD", "OR", "AND", "XOR", 
		"ARROW", "EQ", "NOT_EQ", "LET", "GET", "SET_VAR", "SHIFT_LEFT", "SHIFT_RIGHT", 
		"SEMI", "COLON", "DOT", "COMMA", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", 
		"LBRACK", "PLUS", "MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", 
		"GTH", "LTH", "Double_Quote", "INTEGER_NUM", "VARCHAR_NUM", "BINARY_NUM", 
		"HEX_DIGIT", "REAL_NUMBER", "TEXT_STRING", "ID", "LINE_COMMENT", "BLOCK_COMMENT", 
		"WHITE_SPACE", "SL_COMMENT", "Regex_Escaped_Unicode"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "uniformSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public uniformSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(uniformSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(uniformSQLParser.FALSE, 0); }
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public TerminalNode ASC() { return getToken(uniformSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(uniformSQLParser.DESC, 0); }
		public TerminalNode ORDER() { return getToken(uniformSQLParser.ORDER, 0); }
		public TerminalNode GROUP() { return getToken(uniformSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public TerminalNode HAVING() { return getToken(uniformSQLParser.HAVING, 0); }
		public TerminalNode WHERE() { return getToken(uniformSQLParser.WHERE, 0); }
		public TerminalNode FROM() { return getToken(uniformSQLParser.FROM, 0); }
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public TerminalNode SELECT() { return getToken(uniformSQLParser.SELECT, 0); }
		public TerminalNode DISTINCT() { return getToken(uniformSQLParser.DISTINCT, 0); }
		public TerminalNode INSERT() { return getToken(uniformSQLParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(uniformSQLParser.OVERWRITE, 0); }
		public TerminalNode OUTER() { return getToken(uniformSQLParser.OUTER, 0); }
		public TerminalNode UNIQUEJOIN() { return getToken(uniformSQLParser.UNIQUEJOIN, 0); }
		public TerminalNode PRESERVE() { return getToken(uniformSQLParser.PRESERVE, 0); }
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(uniformSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(uniformSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(uniformSQLParser.FULL, 0); }
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode PARTITION() { return getToken(uniformSQLParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(uniformSQLParser.PARTITIONS, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(uniformSQLParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(uniformSQLParser.COLUMNS, 0); }
		public TerminalNode INDEX() { return getToken(uniformSQLParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(uniformSQLParser.INDEXES, 0); }
		public TerminalNode REBUILD() { return getToken(uniformSQLParser.REBUILD, 0); }
		public TerminalNode FUNCTIONS() { return getToken(uniformSQLParser.FUNCTIONS, 0); }
		public TerminalNode SHOW() { return getToken(uniformSQLParser.SHOW, 0); }
		public TerminalNode MSCK() { return getToken(uniformSQLParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(uniformSQLParser.REPAIR, 0); }
		public TerminalNode DIRECTORY() { return getToken(uniformSQLParser.DIRECTORY, 0); }
		public TerminalNode LOCAL() { return getToken(uniformSQLParser.LOCAL, 0); }
		public TerminalNode TRANSFORM() { return getToken(uniformSQLParser.TRANSFORM, 0); }
		public TerminalNode USING() { return getToken(uniformSQLParser.USING, 0); }
		public TerminalNode CLUSTER() { return getToken(uniformSQLParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(uniformSQLParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(uniformSQLParser.SORT, 0); }
		public TerminalNode UNION() { return getToken(uniformSQLParser.UNION, 0); }
		public TerminalNode LOAD() { return getToken(uniformSQLParser.LOAD, 0); }
		public TerminalNode EXPORT() { return getToken(uniformSQLParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(uniformSQLParser.IMPORT, 0); }
		public TerminalNode DATA() { return getToken(uniformSQLParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(uniformSQLParser.INPATH, 0); }
		public TerminalNode IS() { return getToken(uniformSQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode ALTER() { return getToken(uniformSQLParser.ALTER, 0); }
		public TerminalNode CHANGE() { return getToken(uniformSQLParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(uniformSQLParser.COLUMN, 0); }
		public TerminalNode FIRST() { return getToken(uniformSQLParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(uniformSQLParser.AFTER, 0); }
		public TerminalNode DESCRIBE() { return getToken(uniformSQLParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode RENAME() { return getToken(uniformSQLParser.RENAME, 0); }
		public TerminalNode IGNORE() { return getToken(uniformSQLParser.IGNORE, 0); }
		public TerminalNode PROTECTION() { return getToken(uniformSQLParser.PROTECTION, 0); }
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode BOOLEAN() { return getToken(uniformSQLParser.BOOLEAN, 0); }
		public TerminalNode TINYINT() { return getToken(uniformSQLParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(uniformSQLParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(uniformSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(uniformSQLParser.BIGINT, 0); }
		public TerminalNode FLOAT() { return getToken(uniformSQLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(uniformSQLParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(uniformSQLParser.DATETIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(uniformSQLParser.TIMESTAMP, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(uniformSQLParser.STRING, 0); }
		public TerminalNode VARCHAR() { return getToken(uniformSQLParser.VARCHAR, 0); }
		public TerminalNode ARRAY() { return getToken(uniformSQLParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(uniformSQLParser.STRUCT, 0); }
		public TerminalNode MAP() { return getToken(uniformSQLParser.MAP, 0); }
		public TerminalNode UNIONTYPE() { return getToken(uniformSQLParser.UNIONTYPE, 0); }
		public TerminalNode REDUCE() { return getToken(uniformSQLParser.REDUCE, 0); }
		public TerminalNode PARTITIONED() { return getToken(uniformSQLParser.PARTITIONED, 0); }
		public TerminalNode CLUSTERED() { return getToken(uniformSQLParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(uniformSQLParser.SORTED, 0); }
		public TerminalNode INTO() { return getToken(uniformSQLParser.INTO, 0); }
		public TerminalNode BUCKETS() { return getToken(uniformSQLParser.BUCKETS, 0); }
		public TerminalNode ROW() { return getToken(uniformSQLParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(uniformSQLParser.ROWS, 0); }
		public TerminalNode FORMAT() { return getToken(uniformSQLParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(uniformSQLParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(uniformSQLParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(uniformSQLParser.TERMINATED, 0); }
		public TerminalNode ESCAPED() { return getToken(uniformSQLParser.ESCAPED, 0); }
		public TerminalNode COLLECTION() { return getToken(uniformSQLParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(uniformSQLParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(uniformSQLParser.KEYS, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public TerminalNode LINES() { return getToken(uniformSQLParser.LINES, 0); }
		public TerminalNode STORED() { return getToken(uniformSQLParser.STORED, 0); }
		public TerminalNode FILEFORMAT() { return getToken(uniformSQLParser.FILEFORMAT, 0); }
		public TerminalNode SEQUENCEFILE() { return getToken(uniformSQLParser.SEQUENCEFILE, 0); }
		public TerminalNode TEXTFILE() { return getToken(uniformSQLParser.TEXTFILE, 0); }
		public TerminalNode RCFILE() { return getToken(uniformSQLParser.RCFILE, 0); }
		public TerminalNode ORCFILE() { return getToken(uniformSQLParser.ORCFILE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(uniformSQLParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(uniformSQLParser.OUTPUTFORMAT, 0); }
		public TerminalNode INPUTDRIVER() { return getToken(uniformSQLParser.INPUTDRIVER, 0); }
		public TerminalNode OUTPUTDRIVER() { return getToken(uniformSQLParser.OUTPUTDRIVER, 0); }
		public TerminalNode OFFLINE() { return getToken(uniformSQLParser.OFFLINE, 0); }
		public TerminalNode ENABLE() { return getToken(uniformSQLParser.ENABLE, 0); }
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public TerminalNode DISABLE() { return getToken(uniformSQLParser.DISABLE, 0); }
		public TerminalNode READONLY() { return getToken(uniformSQLParser.READONLY, 0); }
		public TerminalNode LOCATION() { return getToken(uniformSQLParser.LOCATION, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(uniformSQLParser.TABLESAMPLE, 0); }
		public TerminalNode BUCKET() { return getToken(uniformSQLParser.BUCKET, 0); }
		public TerminalNode OUT() { return getToken(uniformSQLParser.OUT, 0); }
		public TerminalNode OF() { return getToken(uniformSQLParser.OF, 0); }
		public TerminalNode PERCENT() { return getToken(uniformSQLParser.PERCENT, 0); }
		public TerminalNode CAST() { return getToken(uniformSQLParser.CAST, 0); }
		public TerminalNode ADD() { return getToken(uniformSQLParser.ADD, 0); }
		public TerminalNode REPLACE() { return getToken(uniformSQLParser.REPLACE, 0); }
		public TerminalNode RLIKE() { return getToken(uniformSQLParser.RLIKE, 0); }
		public TerminalNode REGEXP() { return getToken(uniformSQLParser.REGEXP, 0); }
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode FUNCTION() { return getToken(uniformSQLParser.FUNCTION, 0); }
		public TerminalNode MACRO() { return getToken(uniformSQLParser.MACRO, 0); }
		public TerminalNode EXPLAIN() { return getToken(uniformSQLParser.EXPLAIN, 0); }
		public TerminalNode EXTENDED() { return getToken(uniformSQLParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(uniformSQLParser.FORMATTED, 0); }
		public TerminalNode PRETTY() { return getToken(uniformSQLParser.PRETTY, 0); }
		public TerminalNode DEPENDENCY() { return getToken(uniformSQLParser.DEPENDENCY, 0); }
		public TerminalNode LOGICAL() { return getToken(uniformSQLParser.LOGICAL, 0); }
		public TerminalNode SERDE() { return getToken(uniformSQLParser.SERDE, 0); }
		public TerminalNode WITH() { return getToken(uniformSQLParser.WITH, 0); }
		public TerminalNode DEFERRED() { return getToken(uniformSQLParser.DEFERRED, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(uniformSQLParser.SERDEPROPERTIES, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(uniformSQLParser.DBPROPERTIES, 0); }
		public TerminalNode LIMIT() { return getToken(uniformSQLParser.LIMIT, 0); }
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public TerminalNode UNSET() { return getToken(uniformSQLParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(uniformSQLParser.TBLPROPERTIES, 0); }
		public TerminalNode IDXPROPERTIES() { return getToken(uniformSQLParser.IDXPROPERTIES, 0); }
		public TerminalNode CASCADED() { return getToken(uniformSQLParser.CASCADED, 0); }
		public TerminalNode THEN() { return getToken(uniformSQLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(uniformSQLParser.ELSE, 0); }
		public List<TerminalNode> END() { return getTokens(uniformSQLParser.END); }
		public TerminalNode END(int i) {
			return getToken(uniformSQLParser.END, i);
		}
		public TerminalNode MAPJOIN() { return getToken(uniformSQLParser.MAPJOIN, 0); }
		public TerminalNode STREAMTABLE() { return getToken(uniformSQLParser.STREAMTABLE, 0); }
		public TerminalNode CLUSTERSTATUS() { return getToken(uniformSQLParser.CLUSTERSTATUS, 0); }
		public TerminalNode UTC() { return getToken(uniformSQLParser.UTC, 0); }
		public TerminalNode LONG() { return getToken(uniformSQLParser.LONG, 0); }
		public TerminalNode DELETE() { return getToken(uniformSQLParser.DELETE, 0); }
		public TerminalNode FETCH() { return getToken(uniformSQLParser.FETCH, 0); }
		public TerminalNode INTERSECT() { return getToken(uniformSQLParser.INTERSECT, 0); }
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public TerminalNode IN() { return getToken(uniformSQLParser.IN, 0); }
		public TerminalNode DATABASE() { return getToken(uniformSQLParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(uniformSQLParser.DATABASES, 0); }
		public TerminalNode MATERIALIZED() { return getToken(uniformSQLParser.MATERIALIZED, 0); }
		public TerminalNode SCHEMA() { return getToken(uniformSQLParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(uniformSQLParser.SCHEMAS, 0); }
		public TerminalNode GRANT() { return getToken(uniformSQLParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(uniformSQLParser.REVOKE, 0); }
		public TerminalNode SSL() { return getToken(uniformSQLParser.SSL, 0); }
		public TerminalNode UNDO() { return getToken(uniformSQLParser.UNDO, 0); }
		public TerminalNode LOCK() { return getToken(uniformSQLParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(uniformSQLParser.LOCKS, 0); }
		public TerminalNode UNLOCK() { return getToken(uniformSQLParser.UNLOCK, 0); }
		public TerminalNode SHARED() { return getToken(uniformSQLParser.SHARED, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(uniformSQLParser.EXCLUSIVE, 0); }
		public TerminalNode PROCEDURE() { return getToken(uniformSQLParser.PROCEDURE, 0); }
		public TerminalNode UNSIGNED() { return getToken(uniformSQLParser.UNSIGNED, 0); }
		public TerminalNode WHILE() { return getToken(uniformSQLParser.WHILE, 0); }
		public TerminalNode READ() { return getToken(uniformSQLParser.READ, 0); }
		public TerminalNode READS() { return getToken(uniformSQLParser.READS, 0); }
		public TerminalNode PURGE() { return getToken(uniformSQLParser.PURGE, 0); }
		public TerminalNode RANGE() { return getToken(uniformSQLParser.RANGE, 0); }
		public TerminalNode ANALYZE() { return getToken(uniformSQLParser.ANALYZE, 0); }
		public TerminalNode BEFORE() { return getToken(uniformSQLParser.BEFORE, 0); }
		public TerminalNode BETWEEN() { return getToken(uniformSQLParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(uniformSQLParser.BOTH, 0); }
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public TerminalNode CROSS() { return getToken(uniformSQLParser.CROSS, 0); }
		public TerminalNode CONTINUE() { return getToken(uniformSQLParser.CONTINUE, 0); }
		public TerminalNode CURSOR() { return getToken(uniformSQLParser.CURSOR, 0); }
		public TerminalNode TRIGGER() { return getToken(uniformSQLParser.TRIGGER, 0); }
		public TerminalNode RECORDREADER() { return getToken(uniformSQLParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(uniformSQLParser.RECORDWRITER, 0); }
		public TerminalNode LATERAL() { return getToken(uniformSQLParser.LATERAL, 0); }
		public TerminalNode TOUCH() { return getToken(uniformSQLParser.TOUCH, 0); }
		public TerminalNode ARCHIVE() { return getToken(uniformSQLParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(uniformSQLParser.UNARCHIVE, 0); }
		public TerminalNode COMPUTE() { return getToken(uniformSQLParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(uniformSQLParser.STATISTICS, 0); }
		public TerminalNode USE() { return getToken(uniformSQLParser.USE, 0); }
		public TerminalNode OPTION() { return getToken(uniformSQLParser.OPTION, 0); }
		public TerminalNode CONCATENATE() { return getToken(uniformSQLParser.CONCATENATE, 0); }
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public TerminalNode RESTRICT() { return getToken(uniformSQLParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(uniformSQLParser.CASCADE, 0); }
		public TerminalNode SKEWED() { return getToken(uniformSQLParser.SKEWED, 0); }
		public TerminalNode ROLLUP() { return getToken(uniformSQLParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(uniformSQLParser.CUBE, 0); }
		public TerminalNode DIRECTORIES() { return getToken(uniformSQLParser.DIRECTORIES, 0); }
		public TerminalNode FOR() { return getToken(uniformSQLParser.FOR, 0); }
		public TerminalNode WINDOW() { return getToken(uniformSQLParser.WINDOW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(uniformSQLParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(uniformSQLParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(uniformSQLParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(uniformSQLParser.CURRENT, 0); }
		public TerminalNode LESS() { return getToken(uniformSQLParser.LESS, 0); }
		public TerminalNode MORE() { return getToken(uniformSQLParser.MORE, 0); }
		public TerminalNode OVER() { return getToken(uniformSQLParser.OVER, 0); }
		public TerminalNode GROUPING() { return getToken(uniformSQLParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(uniformSQLParser.SETS, 0); }
		public TerminalNode TRUNCATE() { return getToken(uniformSQLParser.TRUNCATE, 0); }
		public TerminalNode NOSCAN() { return getToken(uniformSQLParser.NOSCAN, 0); }
		public TerminalNode PARTIALSCAN() { return getToken(uniformSQLParser.PARTIALSCAN, 0); }
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(uniformSQLParser.ROLE, 0); }
		public TerminalNode INNER() { return getToken(uniformSQLParser.INNER, 0); }
		public TerminalNode EXCHANGE() { return getToken(uniformSQLParser.EXCHANGE, 0); }
		public TerminalNode IDENTIFIED() { return getToken(uniformSQLParser.IDENTIFIED, 0); }
		public TerminalNode CHAR() { return getToken(uniformSQLParser.CHAR, 0); }
		public TerminalNode ABS() { return getToken(uniformSQLParser.ABS, 0); }
		public TerminalNode ACOS() { return getToken(uniformSQLParser.ACOS, 0); }
		public TerminalNode ASIN() { return getToken(uniformSQLParser.ASIN, 0); }
		public TerminalNode ATAN() { return getToken(uniformSQLParser.ATAN, 0); }
		public TerminalNode CEIL() { return getToken(uniformSQLParser.CEIL, 0); }
		public TerminalNode COS() { return getToken(uniformSQLParser.COS, 0); }
		public TerminalNode COT() { return getToken(uniformSQLParser.COT, 0); }
		public TerminalNode EXP() { return getToken(uniformSQLParser.EXP, 0); }
		public TerminalNode FLOOR() { return getToken(uniformSQLParser.FLOOR, 0); }
		public TerminalNode LN() { return getToken(uniformSQLParser.LN, 0); }
		public TerminalNode POW() { return getToken(uniformSQLParser.POW, 0); }
		public TerminalNode RAND() { return getToken(uniformSQLParser.RAND, 0); }
		public TerminalNode ROUND() { return getToken(uniformSQLParser.ROUND, 0); }
		public TerminalNode SIN() { return getToken(uniformSQLParser.SIN, 0); }
		public TerminalNode SQRT() { return getToken(uniformSQLParser.SQRT, 0); }
		public TerminalNode TAN() { return getToken(uniformSQLParser.TAN, 0); }
		public TerminalNode LCASE() { return getToken(uniformSQLParser.LCASE, 0); }
		public TerminalNode LOWER() { return getToken(uniformSQLParser.LOWER, 0); }
		public TerminalNode LTRIM() { return getToken(uniformSQLParser.LTRIM, 0); }
		public TerminalNode RTRIM() { return getToken(uniformSQLParser.RTRIM, 0); }
		public TerminalNode CONCAT() { return getToken(uniformSQLParser.CONCAT, 0); }
		public TerminalNode SUBSTR() { return getToken(uniformSQLParser.SUBSTR, 0); }
		public TerminalNode TRIM() { return getToken(uniformSQLParser.TRIM, 0); }
		public TerminalNode UCASE() { return getToken(uniformSQLParser.UCASE, 0); }
		public TerminalNode UPPER() { return getToken(uniformSQLParser.UPPER, 0); }
		public TerminalNode INTERVAL() { return getToken(uniformSQLParser.INTERVAL, 0); }
		public TerminalNode TO_DATE() { return getToken(uniformSQLParser.TO_DATE, 0); }
		public TerminalNode DAY() { return getToken(uniformSQLParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(uniformSQLParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(uniformSQLParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(uniformSQLParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(uniformSQLParser.SECOND, 0); }
		public TerminalNode FROM_UNIXTIME() { return getToken(uniformSQLParser.FROM_UNIXTIME, 0); }
		public TerminalNode YEAR() { return getToken(uniformSQLParser.YEAR, 0); }
		public TerminalNode DATE_ADD() { return getToken(uniformSQLParser.DATE_ADD, 0); }
		public TerminalNode DATE_SUB() { return getToken(uniformSQLParser.DATE_SUB, 0); }
		public TerminalNode COLLATE() { return getToken(uniformSQLParser.COLLATE, 0); }
		public TerminalNode AVG() { return getToken(uniformSQLParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(uniformSQLParser.COUNT, 0); }
		public TerminalNode MAX() { return getToken(uniformSQLParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(uniformSQLParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(uniformSQLParser.SUM, 0); }
		public TerminalNode COALESCE() { return getToken(uniformSQLParser.COALESCE, 0); }
		public TerminalNode DUPLICATE() { return getToken(uniformSQLParser.DUPLICATE, 0); }
		public TerminalNode SERVER() { return getToken(uniformSQLParser.SERVER, 0); }
		public TerminalNode ALIASES() { return getToken(uniformSQLParser.ALIASES, 0); }
		public TerminalNode ALIAS() { return getToken(uniformSQLParser.ALIAS, 0); }
		public TerminalNode VALUES() { return getToken(uniformSQLParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(uniformSQLParser.VALUE, 0); }
		public TerminalNode LOW_PRIORITY() { return getToken(uniformSQLParser.LOW_PRIORITY, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(uniformSQLParser.HIGH_PRIORITY, 0); }
		public TerminalNode HASH() { return getToken(uniformSQLParser.HASH, 0); }
		public TerminalNode REFERENCES() { return getToken(uniformSQLParser.REFERENCES, 0); }
		public TerminalNode TO_CHAR() { return getToken(uniformSQLParser.TO_CHAR, 0); }
		public TerminalNode DATE_FORMAT() { return getToken(uniformSQLParser.DATE_FORMAT, 0); }
		public TerminalNode SIGNED() { return getToken(uniformSQLParser.SIGNED, 0); }
		public TerminalNode INTEGER() { return getToken(uniformSQLParser.INTEGER, 0); }
		public TerminalNode LENGTH() { return getToken(uniformSQLParser.LENGTH, 0); }
		public TerminalNode REVERSE() { return getToken(uniformSQLParser.REVERSE, 0); }
		public TerminalNode IFNULL() { return getToken(uniformSQLParser.IFNULL, 0); }
		public TerminalNode DIVIDE() { return getToken(uniformSQLParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(uniformSQLParser.MOD, 0); }
		public TerminalNode OR() { return getToken(uniformSQLParser.OR, 0); }
		public TerminalNode AND() { return getToken(uniformSQLParser.AND, 0); }
		public TerminalNode XOR() { return getToken(uniformSQLParser.XOR, 0); }
		public TerminalNode ARROW() { return getToken(uniformSQLParser.ARROW, 0); }
		public TerminalNode EQ() { return getToken(uniformSQLParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(uniformSQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(uniformSQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(uniformSQLParser.GET, 0); }
		public TerminalNode SET_VAR() { return getToken(uniformSQLParser.SET_VAR, 0); }
		public TerminalNode SHIFT_LEFT() { return getToken(uniformSQLParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(uniformSQLParser.SHIFT_RIGHT, 0); }
		public TerminalNode CASE() { return getToken(uniformSQLParser.CASE, 0); }
		public TerminalNode WHEN() { return getToken(uniformSQLParser.WHEN, 0); }
		public TerminalNode CHARACTER() { return getToken(uniformSQLParser.CHARACTER, 0); }
		public TerminalNode HEX() { return getToken(uniformSQLParser.HEX, 0); }
		public TerminalNode CONV() { return getToken(uniformSQLParser.CONV, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ALL) | (1L << NOT) | (1L << LIKE) | (1L << CHARACTER) | (1L << IF) | (1L << EXISTS) | (1L << ASC) | (1L << DESC) | (1L << ORDER) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << WHERE) | (1L << FROM) | (1L << AS) | (1L << SELECT) | (1L << DISTINCT) | (1L << INSERT) | (1L << OVERWRITE) | (1L << OUTER) | (1L << UNIQUEJOIN) | (1L << PRESERVE) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL) | (1L << ON) | (1L << PARTITION) | (1L << PARTITIONS) | (1L << TABLE) | (1L << TABLES) | (1L << COLUMNS) | (1L << INDEX) | (1L << INDEXES) | (1L << REBUILD) | (1L << FUNCTIONS) | (1L << SHOW) | (1L << MSCK) | (1L << REPAIR) | (1L << DIRECTORY) | (1L << LOCAL) | (1L << TRANSFORM) | (1L << USING) | (1L << CLUSTER) | (1L << DISTRIBUTE) | (1L << SORT) | (1L << UNION) | (1L << LOAD) | (1L << EXPORT) | (1L << IMPORT) | (1L << DATA) | (1L << INPATH) | (1L << IS) | (1L << NULL) | (1L << CREATE) | (1L << EXTERNAL) | (1L << ALTER) | (1L << CHANGE) | (1L << COLUMN) | (1L << FIRST) | (1L << AFTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DESCRIBE - 64)) | (1L << (DROP - 64)) | (1L << (RENAME - 64)) | (1L << (IGNORE - 64)) | (1L << (PROTECTION - 64)) | (1L << (TO - 64)) | (1L << (COMMENT - 64)) | (1L << (BOOLEAN - 64)) | (1L << (TINYINT - 64)) | (1L << (SMALLINT - 64)) | (1L << (INT - 64)) | (1L << (BIGINT - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (DATE - 64)) | (1L << (DATETIME - 64)) | (1L << (TIMESTAMP - 64)) | (1L << (DECIMAL - 64)) | (1L << (STRING - 64)) | (1L << (VARCHAR - 64)) | (1L << (ARRAY - 64)) | (1L << (STRUCT - 64)) | (1L << (MAP - 64)) | (1L << (UNIONTYPE - 64)) | (1L << (REDUCE - 64)) | (1L << (PARTITIONED - 64)) | (1L << (CLUSTERED - 64)) | (1L << (SORTED - 64)) | (1L << (INTO - 64)) | (1L << (BUCKETS - 64)) | (1L << (ROW - 64)) | (1L << (ROWS - 64)) | (1L << (FORMAT - 64)) | (1L << (DELIMITED - 64)) | (1L << (FIELDS - 64)) | (1L << (TERMINATED - 64)) | (1L << (ESCAPED - 64)) | (1L << (COLLECTION - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (KEY - 64)) | (1L << (LINES - 64)) | (1L << (STORED - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (SEQUENCEFILE - 64)) | (1L << (TEXTFILE - 64)) | (1L << (RCFILE - 64)) | (1L << (ORCFILE - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (OUTPUTFORMAT - 64)) | (1L << (INPUTDRIVER - 64)) | (1L << (OUTPUTDRIVER - 64)) | (1L << (OFFLINE - 64)) | (1L << (ENABLE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DISABLE - 64)) | (1L << (READONLY - 64)) | (1L << (LOCATION - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (BUCKET - 64)) | (1L << (OUT - 64)) | (1L << (OF - 64)) | (1L << (PERCENT - 64)) | (1L << (CAST - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ADD - 128)) | (1L << (REPLACE - 128)) | (1L << (RLIKE - 128)) | (1L << (REGEXP - 128)) | (1L << (TEMPORARY - 128)) | (1L << (FUNCTION - 128)) | (1L << (MACRO - 128)) | (1L << (EXPLAIN - 128)) | (1L << (EXTENDED - 128)) | (1L << (FORMATTED - 128)) | (1L << (PRETTY - 128)) | (1L << (DEPENDENCY - 128)) | (1L << (LOGICAL - 128)) | (1L << (SERDE - 128)) | (1L << (WITH - 128)) | (1L << (DEFERRED - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (LIMIT - 128)) | (1L << (SET - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (IDXPROPERTIES - 128)) | (1L << (CASCADED - 128)) | (1L << (CASE - 128)) | (1L << (WHEN - 128)) | (1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (END - 128)) | (1L << (MAPJOIN - 128)) | (1L << (STREAMTABLE - 128)) | (1L << (CLUSTERSTATUS - 128)) | (1L << (UTC - 128)) | (1L << (LONG - 128)) | (1L << (DELETE - 128)) | (1L << (FETCH - 128)) | (1L << (INTERSECT - 128)) | (1L << (VIEW - 128)) | (1L << (IN - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (GRANT - 128)) | (1L << (REVOKE - 128)) | (1L << (SSL - 128)) | (1L << (UNDO - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (UNLOCK - 128)) | (1L << (SHARED - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (PROCEDURE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (WHILE - 128)) | (1L << (READ - 128)) | (1L << (READS - 128)) | (1L << (PURGE - 128)) | (1L << (RANGE - 128)) | (1L << (ANALYZE - 128)) | (1L << (BEFORE - 128)) | (1L << (BETWEEN - 128)) | (1L << (BOTH - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BINARY - 192)) | (1L << (CROSS - 192)) | (1L << (CONTINUE - 192)) | (1L << (CURSOR - 192)) | (1L << (TRIGGER - 192)) | (1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (LATERAL - 192)) | (1L << (TOUCH - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (COMPUTE - 192)) | (1L << (STATISTICS - 192)) | (1L << (USE - 192)) | (1L << (OPTION - 192)) | (1L << (CONCATENATE - 192)) | (1L << (UPDATE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CASCADE - 192)) | (1L << (SKEWED - 192)) | (1L << (ROLLUP - 192)) | (1L << (CUBE - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (FOR - 192)) | (1L << (WINDOW - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (PRECEDING - 192)) | (1L << (FOLLOWING - 192)) | (1L << (CURRENT - 192)) | (1L << (LESS - 192)) | (1L << (MORE - 192)) | (1L << (OVER - 192)) | (1L << (GROUPING - 192)) | (1L << (SETS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (NOSCAN - 192)) | (1L << (PARTIALSCAN - 192)) | (1L << (USER - 192)) | (1L << (ROLE - 192)) | (1L << (INNER - 192)) | (1L << (EXCHANGE - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (CHAR - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ASIN - 192)) | (1L << (ATAN - 192)) | (1L << (CEIL - 192)) | (1L << (COS - 192)) | (1L << (COT - 192)) | (1L << (EXP - 192)) | (1L << (FLOOR - 192)) | (1L << (LN - 192)) | (1L << (POW - 192)) | (1L << (RAND - 192)) | (1L << (ROUND - 192)) | (1L << (SIN - 192)) | (1L << (SQRT - 192)) | (1L << (TAN - 192)) | (1L << (LCASE - 192)) | (1L << (LOWER - 192)) | (1L << (LTRIM - 192)) | (1L << (RTRIM - 192)) | (1L << (CONCAT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SUBSTR - 256)) | (1L << (TRIM - 256)) | (1L << (UCASE - 256)) | (1L << (UPPER - 256)) | (1L << (INTERVAL - 256)) | (1L << (TO_DATE - 256)) | (1L << (DAY - 256)) | (1L << (HOUR - 256)) | (1L << (MINUTE - 256)) | (1L << (MONTH - 256)) | (1L << (SECOND - 256)) | (1L << (FROM_UNIXTIME - 256)) | (1L << (YEAR - 256)) | (1L << (DATE_ADD - 256)) | (1L << (DATE_SUB - 256)) | (1L << (COLLATE - 256)) | (1L << (AVG - 256)) | (1L << (COUNT - 256)) | (1L << (MAX - 256)) | (1L << (MIN - 256)) | (1L << (SUM - 256)) | (1L << (COALESCE - 256)) | (1L << (DUPLICATE - 256)) | (1L << (SERVER - 256)) | (1L << (ALIASES - 256)) | (1L << (ALIAS - 256)) | (1L << (VALUES - 256)) | (1L << (VALUE - 256)) | (1L << (LOW_PRIORITY - 256)) | (1L << (HIGH_PRIORITY - 256)) | (1L << (HASH - 256)) | (1L << (REFERENCES - 256)) | (1L << (TO_CHAR - 256)) | (1L << (DATE_FORMAT - 256)) | (1L << (SIGNED - 256)) | (1L << (INTEGER - 256)) | (1L << (LENGTH - 256)) | (1L << (REVERSE - 256)) | (1L << (IFNULL - 256)) | (1L << (HEX - 256)) | (1L << (CONV - 256)) | (1L << (DIVIDE - 256)) | (1L << (MOD - 256)) | (1L << (OR - 256)) | (1L << (AND - 256)) | (1L << (XOR - 256)) | (1L << (ARROW - 256)) | (1L << (EQ - 256)) | (1L << (NOT_EQ - 256)) | (1L << (LET - 256)) | (1L << (GET - 256)) | (1L << (SET_VAR - 256)) | (1L << (SHIFT_LEFT - 256)) | (1L << (SHIFT_RIGHT - 256)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delimited_statementContext extends ParserRuleContext {
		public TerminalNode Regex_Escaped_Unicode() { return getToken(uniformSQLParser.Regex_Escaped_Unicode, 0); }
		public Delimited_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimited_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDelimited_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delimited_statementContext delimited_statement() throws RecognitionException {
		Delimited_statementContext _localctx = new Delimited_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_delimited_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Regex_Escaped_Unicode);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_typesContext extends ParserRuleContext {
		public TerminalNode TINYINT() { return getToken(uniformSQLParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(uniformSQLParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(uniformSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(uniformSQLParser.BIGINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(uniformSQLParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(uniformSQLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(uniformSQLParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(uniformSQLParser.TIMESTAMP, 0); }
		public TerminalNode VARCHAR() { return getToken(uniformSQLParser.VARCHAR, 0); }
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public Integer_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInteger_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_typesContext integer_types() throws RecognitionException {
		Integer_typesContext _localctx = new Integer_typesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integer_types);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(TINYINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(SMALLINT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				match(INT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				match(BIGINT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				match(BOOLEAN);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(302);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(303);
				match(DOUBLE);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(304);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 10);
				{
				setState(305);
				match(TIMESTAMP);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(306);
				match(VARCHAR);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 12);
				{
				setState(307);
				match(BINARY);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 13);
				{
				setState(308);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(uniformSQLParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(uniformSQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(uniformSQLParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(uniformSQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(uniformSQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(uniformSQLParser.GET, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRelational_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !(((((_la - 303)) & ~0x3f) == 0 && ((1L << (_la - 303)) & ((1L << (EQ - 303)) | (1L << (NOT_EQ - 303)) | (1L << (LET - 303)) | (1L << (GET - 303)) | (1L << (GTH - 303)) | (1L << (LTH - 303)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_data_typeContext extends ParserRuleContext {
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public List<TerminalNode> INTEGER_NUM() { return getTokens(uniformSQLParser.INTEGER_NUM); }
		public TerminalNode INTEGER_NUM(int i) {
			return getToken(uniformSQLParser.INTEGER_NUM, i);
		}
		public TerminalNode CHAR() { return getToken(uniformSQLParser.CHAR, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(uniformSQLParser.DATETIME, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(uniformSQLParser.COMMA, 0); }
		public TerminalNode SIGNED() { return getToken(uniformSQLParser.SIGNED, 0); }
		public TerminalNode INTEGER() { return getToken(uniformSQLParser.INTEGER, 0); }
		public TerminalNode UNSIGNED() { return getToken(uniformSQLParser.UNSIGNED, 0); }
		public Cast_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCast_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_data_typeContext cast_data_type() throws RecognitionException {
		Cast_data_typeContext _localctx = new Cast_data_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cast_data_type);
		int _la;
		try {
			setState(341);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(BINARY);
				setState(315);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(314);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(CHAR);
				setState(319);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(318);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(DATETIME);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(DECIMAL);
				setState(331);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(324);
					match(LPAREN);
					setState(325);
					match(INTEGER_NUM);
					setState(328);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(326);
						match(COMMA);
						setState(327);
						match(INTEGER_NUM);
						}
					}

					setState(330);
					match(RPAREN);
					}
				}

				}
				break;
			case SIGNED:
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				match(SIGNED);
				setState(335);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(334);
					match(INTEGER);
					}
				}

				}
				break;
			case UNSIGNED:
				enterOuterAlt(_localctx, 7);
				{
				setState(337);
				match(UNSIGNED);
				setState(339);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(338);
					match(INTEGER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_unitContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(uniformSQLParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(uniformSQLParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(uniformSQLParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(uniformSQLParser.DAY, 0); }
		public TerminalNode MONTH() { return getToken(uniformSQLParser.MONTH, 0); }
		public TerminalNode YEAR() { return getToken(uniformSQLParser.YEAR, 0); }
		public Interval_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInterval_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_unitContext interval_unit() throws RecognitionException {
		Interval_unitContext _localctx = new Interval_unitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interval_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (DAY - 262)) | (1L << (HOUR - 262)) | (1L << (MINUTE - 262)) | (1L << (MONTH - 262)) | (1L << (SECOND - 262)) | (1L << (YEAR - 262)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(TEXT_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public TerminalNode REAL_NUMBER() { return getToken(uniformSQLParser.REAL_NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(uniformSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(uniformSQLParser.MINUS, 0); }
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitNumber_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(347);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(350);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUM || _la==REAL_NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_literalContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT() { return getToken(uniformSQLParser.HEX_DIGIT, 0); }
		public Hex_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitHex_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hex_literalContext hex_literal() throws RecognitionException {
		Hex_literalContext _localctx = new Hex_literalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(HEX_DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(uniformSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(uniformSQLParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public Hex_literalContext hex_literal() {
			return getRuleContext(Hex_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			switch (_input.LA(1)) {
			case TEXT_STRING:
				{
				setState(356);
				string_literal();
				}
				break;
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUMBER:
				{
				setState(357);
				number_literal();
				}
				break;
			case HEX_DIGIT:
				{
				setState(358);
				hex_literal();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(359);
				boolean_literal();
				}
				break;
			case NULL:
				{
				setState(360);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionListContext extends ParserRuleContext {
		public Number_functionsContext number_functions() {
			return getRuleContext(Number_functionsContext.class,0);
		}
		public Char_functionsContext char_functions() {
			return getRuleContext(Char_functionsContext.class,0);
		}
		public Time_functionsContext time_functions() {
			return getRuleContext(Time_functionsContext.class,0);
		}
		public Other_functionsContext other_functions() {
			return getRuleContext(Other_functionsContext.class,0);
		}
		public FunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFunctionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionListContext functionList() throws RecognitionException {
		FunctionListContext _localctx = new FunctionListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionList);
		try {
			setState(367);
			switch (_input.LA(1)) {
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case CEIL:
			case COS:
			case COT:
			case EXP:
			case FLOOR:
			case LN:
			case POW:
			case RAND:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				number_functions();
				}
				break;
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TRIM:
			case UCASE:
			case UPPER:
			case TO_CHAR:
			case LENGTH:
			case REVERSE:
			case HEX:
			case CONV:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				char_functions();
				}
				break;
			case TO_DATE:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case FROM_UNIXTIME:
			case YEAR:
			case DATE_ADD:
			case DATE_SUB:
			case DATE_FORMAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				time_functions();
				}
				break;
			case COALESCE:
			case IFNULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				other_functions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_functionsContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(uniformSQLParser.ABS, 0); }
		public TerminalNode ACOS() { return getToken(uniformSQLParser.ACOS, 0); }
		public TerminalNode ASIN() { return getToken(uniformSQLParser.ASIN, 0); }
		public TerminalNode ATAN() { return getToken(uniformSQLParser.ATAN, 0); }
		public TerminalNode CEIL() { return getToken(uniformSQLParser.CEIL, 0); }
		public TerminalNode COS() { return getToken(uniformSQLParser.COS, 0); }
		public TerminalNode COT() { return getToken(uniformSQLParser.COT, 0); }
		public TerminalNode EXP() { return getToken(uniformSQLParser.EXP, 0); }
		public TerminalNode FLOOR() { return getToken(uniformSQLParser.FLOOR, 0); }
		public TerminalNode LN() { return getToken(uniformSQLParser.LN, 0); }
		public TerminalNode POW() { return getToken(uniformSQLParser.POW, 0); }
		public TerminalNode RAND() { return getToken(uniformSQLParser.RAND, 0); }
		public TerminalNode ROUND() { return getToken(uniformSQLParser.ROUND, 0); }
		public TerminalNode SIN() { return getToken(uniformSQLParser.SIN, 0); }
		public TerminalNode SQRT() { return getToken(uniformSQLParser.SQRT, 0); }
		public TerminalNode TAN() { return getToken(uniformSQLParser.TAN, 0); }
		public Number_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitNumber_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_functionsContext number_functions() throws RecognitionException {
		Number_functionsContext _localctx = new Number_functionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !(((((_la - 235)) & ~0x3f) == 0 && ((1L << (_la - 235)) & ((1L << (ABS - 235)) | (1L << (ACOS - 235)) | (1L << (ASIN - 235)) | (1L << (ATAN - 235)) | (1L << (CEIL - 235)) | (1L << (COS - 235)) | (1L << (COT - 235)) | (1L << (EXP - 235)) | (1L << (FLOOR - 235)) | (1L << (LN - 235)) | (1L << (POW - 235)) | (1L << (RAND - 235)) | (1L << (ROUND - 235)) | (1L << (SIN - 235)) | (1L << (SQRT - 235)) | (1L << (TAN - 235)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_functionsContext extends ParserRuleContext {
		public TerminalNode LCASE() { return getToken(uniformSQLParser.LCASE, 0); }
		public TerminalNode LOWER() { return getToken(uniformSQLParser.LOWER, 0); }
		public TerminalNode LTRIM() { return getToken(uniformSQLParser.LTRIM, 0); }
		public TerminalNode RTRIM() { return getToken(uniformSQLParser.RTRIM, 0); }
		public TerminalNode CONCAT() { return getToken(uniformSQLParser.CONCAT, 0); }
		public TerminalNode SUBSTR() { return getToken(uniformSQLParser.SUBSTR, 0); }
		public TerminalNode TRIM() { return getToken(uniformSQLParser.TRIM, 0); }
		public TerminalNode UCASE() { return getToken(uniformSQLParser.UCASE, 0); }
		public TerminalNode UPPER() { return getToken(uniformSQLParser.UPPER, 0); }
		public TerminalNode TO_CHAR() { return getToken(uniformSQLParser.TO_CHAR, 0); }
		public TerminalNode LENGTH() { return getToken(uniformSQLParser.LENGTH, 0); }
		public TerminalNode REVERSE() { return getToken(uniformSQLParser.REVERSE, 0); }
		public TerminalNode HEX() { return getToken(uniformSQLParser.HEX, 0); }
		public TerminalNode CONV() { return getToken(uniformSQLParser.CONV, 0); }
		public Char_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitChar_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_functionsContext char_functions() throws RecognitionException {
		Char_functionsContext _localctx = new Char_functionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_char_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !(((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & ((1L << (LCASE - 251)) | (1L << (LOWER - 251)) | (1L << (LTRIM - 251)) | (1L << (RTRIM - 251)) | (1L << (CONCAT - 251)) | (1L << (SUBSTR - 251)) | (1L << (TRIM - 251)) | (1L << (UCASE - 251)) | (1L << (UPPER - 251)) | (1L << (TO_CHAR - 251)) | (1L << (LENGTH - 251)) | (1L << (REVERSE - 251)) | (1L << (HEX - 251)) | (1L << (CONV - 251)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_functionsContext extends ParserRuleContext {
		public TerminalNode TO_DATE() { return getToken(uniformSQLParser.TO_DATE, 0); }
		public TerminalNode DAY() { return getToken(uniformSQLParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(uniformSQLParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(uniformSQLParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(uniformSQLParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(uniformSQLParser.SECOND, 0); }
		public TerminalNode FROM_UNIXTIME() { return getToken(uniformSQLParser.FROM_UNIXTIME, 0); }
		public TerminalNode YEAR() { return getToken(uniformSQLParser.YEAR, 0); }
		public TerminalNode DATE_ADD() { return getToken(uniformSQLParser.DATE_ADD, 0); }
		public TerminalNode DATE_SUB() { return getToken(uniformSQLParser.DATE_SUB, 0); }
		public TerminalNode DATE_FORMAT() { return getToken(uniformSQLParser.DATE_FORMAT, 0); }
		public Time_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTime_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_functionsContext time_functions() throws RecognitionException {
		Time_functionsContext _localctx = new Time_functionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_time_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !(((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (TO_DATE - 261)) | (1L << (DAY - 261)) | (1L << (HOUR - 261)) | (1L << (MINUTE - 261)) | (1L << (MONTH - 261)) | (1L << (SECOND - 261)) | (1L << (FROM_UNIXTIME - 261)) | (1L << (YEAR - 261)) | (1L << (DATE_ADD - 261)) | (1L << (DATE_SUB - 261)) | (1L << (DATE_FORMAT - 261)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_functionsContext extends ParserRuleContext {
		public TerminalNode COALESCE() { return getToken(uniformSQLParser.COALESCE, 0); }
		public TerminalNode IFNULL() { return getToken(uniformSQLParser.IFNULL, 0); }
		public Other_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitOther_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_functionsContext other_functions() throws RecognitionException {
		Other_functionsContext _localctx = new Other_functionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_other_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==COALESCE || _la==IFNULL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_functionsContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(uniformSQLParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(uniformSQLParser.COUNT, 0); }
		public TerminalNode MAX() { return getToken(uniformSQLParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(uniformSQLParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(uniformSQLParser.SUM, 0); }
		public Group_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_functions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitGroup_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_functionsContext group_functions() throws RecognitionException {
		Group_functionsContext _localctx = new Group_functionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_group_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (AVG - 272)) | (1L << (COUNT - 272)) | (1L << (MAX - 272)) | (1L << (MIN - 272)) | (1L << (SUM - 272)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSchema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Engine_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Engine_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitEngine_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Engine_nameContext engine_name() throws RecognitionException {
		Engine_nameContext _localctx = new Engine_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_engine_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parser_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Parser_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parser_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitParser_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parser_nameContext parser_name() throws RecognitionException {
		Parser_nameContext _localctx = new Parser_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parser_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Partition_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPartition_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_nameContext partition_name() throws RecognitionException {
		Partition_nameContext _localctx = new Partition_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_logical_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Partition_logical_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_logical_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPartition_logical_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_logical_nameContext partition_logical_name() throws RecognitionException {
		Partition_logical_nameContext _localctx = new Partition_logical_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_partition_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constraintbol_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Constraintbol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintbol_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitConstraintbol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constraintbol_nameContext constraintbol_name() throws RecognitionException {
		Constraintbol_nameContext _localctx = new Constraintbol_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constraintbol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_keybol_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_keybol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_keybol_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitForeign_keybol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_keybol_nameContext foreign_keybol_name() throws RecognitionException {
		Foreign_keybol_nameContext _localctx = new Foreign_keybol_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_foreign_keybol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Event_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitEvent_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_nameContext event_name() throws RecognitionException {
		Event_nameContext _localctx = new Event_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_event_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public User_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitUser_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_nameContext user_name() throws RecognitionException {
		User_nameContext _localctx = new User_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_user_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Procedure_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitProcedure_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_nameContext procedure_name() throws RecognitionException {
		Procedure_nameContext _localctx = new Procedure_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_procedure_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Server_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Server_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitServer_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Server_nameContext server_name() throws RecognitionException {
		Server_nameContext _localctx = new Server_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_server_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wrapper_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Wrapper_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrapper_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitWrapper_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wrapper_nameContext wrapper_name() throws RecognitionException {
		Wrapper_nameContext _localctx = new Wrapper_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_wrapper_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(417);
				match(AS);
				}
				break;
			}
			setState(420);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasswordContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Server_alias_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Server_alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_alias_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitServer_alias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Server_alias_nameContext server_alias_name() throws RecognitionException {
		Server_alias_nameContext _localctx = new Server_alias_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_server_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Role_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Role_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRole_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Role_nameContext role_name() throws RecognitionException {
		Role_nameContext _localctx = new Role_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_role_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Group_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitGroup_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_nameContext group_name() throws RecognitionException {
		Group_nameContext _localctx = new Group_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Principal_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Principal_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPrincipal_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Principal_nameContext principal_name() throws RecognitionException {
		Principal_nameContext _localctx = new Principal_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_principal_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_any_name);
		try {
			setState(436);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				string_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Priv_typeContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(uniformSQLParser.INSERT, 0); }
		public TerminalNode SELECT() { return getToken(uniformSQLParser.SELECT, 0); }
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(uniformSQLParser.DELETE, 0); }
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public Priv_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priv_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPriv_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Priv_typeContext priv_type() throws RecognitionException {
		Priv_typeContext _localctx = new Priv_typeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_priv_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << SELECT) | (1L << INSERT))) != 0) || _la==DELETE || _la==UPDATE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Exp_factor1Context> exp_factor1() {
			return getRuleContexts(Exp_factor1Context.class);
		}
		public Exp_factor1Context exp_factor1(int i) {
			return getRuleContext(Exp_factor1Context.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(uniformSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(uniformSQLParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			exp_factor1();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(441);
				match(OR);
				setState(442);
				exp_factor1();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor1Context extends ParserRuleContext {
		public List<Exp_factor2Context> exp_factor2() {
			return getRuleContexts(Exp_factor2Context.class);
		}
		public Exp_factor2Context exp_factor2(int i) {
			return getRuleContext(Exp_factor2Context.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(uniformSQLParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(uniformSQLParser.XOR, i);
		}
		public Exp_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExp_factor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor1Context exp_factor1() throws RecognitionException {
		Exp_factor1Context _localctx = new Exp_factor1Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_exp_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			exp_factor2();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(449);
				match(XOR);
				setState(450);
				exp_factor2();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor2Context extends ParserRuleContext {
		public List<Exp_factor3Context> exp_factor3() {
			return getRuleContexts(Exp_factor3Context.class);
		}
		public Exp_factor3Context exp_factor3(int i) {
			return getRuleContext(Exp_factor3Context.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(uniformSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(uniformSQLParser.AND, i);
		}
		public Exp_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExp_factor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor2Context exp_factor2() throws RecognitionException {
		Exp_factor2Context _localctx = new Exp_factor2Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_exp_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			exp_factor3();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(457);
				match(AND);
				setState(458);
				exp_factor3();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor3Context extends ParserRuleContext {
		public Exp_factor4Context exp_factor4() {
			return getRuleContext(Exp_factor4Context.class,0);
		}
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public Exp_factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExp_factor3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor3Context exp_factor3() throws RecognitionException {
		Exp_factor3Context _localctx = new Exp_factor3Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_exp_factor3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(464);
				match(NOT);
				}
				break;
			}
			setState(467);
			exp_factor4();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_factor4Context extends ParserRuleContext {
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(uniformSQLParser.IS, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public Exp_factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_factor4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExp_factor4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_factor4Context exp_factor4() throws RecognitionException {
		Exp_factor4Context _localctx = new Exp_factor4Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_exp_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			bool_primary();
			setState(478);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(470);
				match(IS);
				setState(472);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(471);
					match(NOT);
					}
				}

				setState(476);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
					{
					setState(474);
					boolean_literal();
					}
					break;
				case NULL:
					{
					setState(475);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_primaryContext extends ParserRuleContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitBool_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_primaryContext bool_primary() throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_bool_primary);
		int _la;
		try {
			setState(497);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(480);
				predicate();
				setState(481);
				relational_op();
				setState(482);
				predicate();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(484);
				predicate();
				setState(485);
				relational_op();
				setState(487);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(486);
					match(ALL);
					}
				}

				setState(489);
				subquery();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(492);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(491);
					match(NOT);
					}
				}

				setState(494);
				match(EXISTS);
				setState(495);
				subquery();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				predicate();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode IN() { return getToken(uniformSQLParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode BETWEEN() { return getToken(uniformSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(uniformSQLParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode REGEXP() { return getToken(uniformSQLParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_predicate);
		int _la;
		try {
			setState(532);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(499);
				bit_expr();
				setState(501);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(500);
					match(NOT);
					}
				}

				setState(503);
				match(IN);
				setState(506);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(504);
					subquery();
					}
					break;
				case 2:
					{
					setState(505);
					expression_list();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(508);
				bit_expr();
				setState(510);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(509);
					match(NOT);
					}
				}

				setState(512);
				match(BETWEEN);
				setState(513);
				bit_expr();
				setState(514);
				match(AND);
				setState(515);
				predicate();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(517);
				bit_expr();
				setState(519);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(518);
					match(NOT);
					}
				}

				setState(521);
				match(LIKE);
				setState(522);
				simple_expr();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(524);
				bit_expr();
				setState(526);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(525);
					match(NOT);
					}
				}

				setState(528);
				match(REGEXP);
				setState(529);
				bit_expr();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(531);
				bit_expr();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_exprContext extends ParserRuleContext {
		public List<Factor1Context> factor1() {
			return getRuleContexts(Factor1Context.class);
		}
		public Factor1Context factor1(int i) {
			return getRuleContext(Factor1Context.class,i);
		}
		public TerminalNode VERTBAR() { return getToken(uniformSQLParser.VERTBAR, 0); }
		public Bit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitBit_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_exprContext bit_expr() throws RecognitionException {
		Bit_exprContext _localctx = new Bit_exprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_bit_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			factor1();
			setState(537);
			_la = _input.LA(1);
			if (_la==VERTBAR) {
				{
				setState(535);
				match(VERTBAR);
				setState(536);
				factor1();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor1Context extends ParserRuleContext {
		public List<Factor2Context> factor2() {
			return getRuleContexts(Factor2Context.class);
		}
		public Factor2Context factor2(int i) {
			return getRuleContext(Factor2Context.class,i);
		}
		public TerminalNode BITAND() { return getToken(uniformSQLParser.BITAND, 0); }
		public Factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor1Context factor1() throws RecognitionException {
		Factor1Context _localctx = new Factor1Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			factor2();
			setState(542);
			_la = _input.LA(1);
			if (_la==BITAND) {
				{
				setState(540);
				match(BITAND);
				setState(541);
				factor2();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor2Context extends ParserRuleContext {
		public List<Factor3Context> factor3() {
			return getRuleContexts(Factor3Context.class);
		}
		public Factor3Context factor3(int i) {
			return getRuleContext(Factor3Context.class,i);
		}
		public TerminalNode SHIFT_LEFT() { return getToken(uniformSQLParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(uniformSQLParser.SHIFT_RIGHT, 0); }
		public Factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor2Context factor2() throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			factor3();
			setState(547);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(545);
				_la = _input.LA(1);
				if ( !(_la==SHIFT_LEFT || _la==SHIFT_RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(546);
				factor3();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor3Context extends ParserRuleContext {
		public List<Factor4Context> factor4() {
			return getRuleContexts(Factor4Context.class);
		}
		public Factor4Context factor4(int i) {
			return getRuleContext(Factor4Context.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(uniformSQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(uniformSQLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(uniformSQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(uniformSQLParser.MINUS, i);
		}
		public Factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor3Context factor3() throws RecognitionException {
		Factor3Context _localctx = new Factor3Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			factor4();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(550);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(551);
				factor4();
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor4Context extends ParserRuleContext {
		public List<Factor5Context> factor5() {
			return getRuleContexts(Factor5Context.class);
		}
		public Factor5Context factor5(int i) {
			return getRuleContext(Factor5Context.class,i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(uniformSQLParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(uniformSQLParser.ASTERISK, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(uniformSQLParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(uniformSQLParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(uniformSQLParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(uniformSQLParser.MOD, i);
		}
		public List<TerminalNode> POWER_OP() { return getTokens(uniformSQLParser.POWER_OP); }
		public TerminalNode POWER_OP(int i) {
			return getToken(uniformSQLParser.POWER_OP, i);
		}
		public Factor4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor4Context factor4() throws RecognitionException {
		Factor4Context _localctx = new Factor4Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_factor4);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			factor5();
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(558);
					_la = _input.LA(1);
					if ( !(((((_la - 297)) & ~0x3f) == 0 && ((1L << (_la - 297)) & ((1L << (DIVIDE - 297)) | (1L << (MOD - 297)) | (1L << (ASTERISK - 297)) | (1L << (POWER_OP - 297)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(559);
					factor5();
					}
					} 
				}
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor5Context extends ParserRuleContext {
		public Factor6Context factor6() {
			return getRuleContext(Factor6Context.class,0);
		}
		public Interval_exprContext interval_expr() {
			return getRuleContext(Interval_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(uniformSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(uniformSQLParser.MINUS, 0); }
		public Factor5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor5; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor5Context factor5() throws RecognitionException {
		Factor5Context _localctx = new Factor5Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_factor5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			factor6();
			setState(568);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(566);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(567);
				interval_expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor6Context extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(uniformSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(uniformSQLParser.MINUS, 0); }
		public TerminalNode NEGATION() { return getToken(uniformSQLParser.NEGATION, 0); }
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public Factor6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor6; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor6Context factor6() throws RecognitionException {
		Factor6Context _localctx = new Factor6Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_factor6);
		int _la;
		try {
			setState(573);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				_la = _input.LA(1);
				if ( !(_la==BINARY || ((((_la - 319)) & ~0x3f) == 0 && ((1L << (_la - 319)) & ((1L << (PLUS - 319)) | (1L << (MINUS - 319)) | (1L << (NEGATION - 319)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(571);
				simple_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				simple_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor7Context extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Factor7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor7; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFactor7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor7Context factor7() throws RecognitionException {
		Factor7Context _localctx = new Factor7Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_factor7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			simple_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Raw_expression_listContext raw_expression_list() {
			return getRuleContext(Raw_expression_listContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Case_when_statementContext case_when_statement() {
			return getRuleContext(Case_when_statementContext.class,0);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_simple_expr);
		try {
			setState(586);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				literal_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				column_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				expression_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(581);
				raw_expression_list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				subquery();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(583);
				match(EXISTS);
				setState(584);
				subquery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(585);
				case_when_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode CAST() { return getToken(uniformSQLParser.CAST, 0); }
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Cast_data_typeContext cast_data_type() {
			return getRuleContext(Cast_data_typeContext.class,0);
		}
		public Group_functionsContext group_functions() {
			return getRuleContext(Group_functionsContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(uniformSQLParser.DISTINCT, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_function_call);
		int _la;
		try {
			setState(621);
			switch (_input.LA(1)) {
			case ABS:
			case ACOS:
			case ASIN:
			case ATAN:
			case CEIL:
			case COS:
			case COT:
			case EXP:
			case FLOOR:
			case LN:
			case POW:
			case RAND:
			case ROUND:
			case SIN:
			case SQRT:
			case TAN:
			case LCASE:
			case LOWER:
			case LTRIM:
			case RTRIM:
			case CONCAT:
			case SUBSTR:
			case TRIM:
			case UCASE:
			case UPPER:
			case TO_DATE:
			case DAY:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
			case FROM_UNIXTIME:
			case YEAR:
			case DATE_ADD:
			case DATE_SUB:
			case COALESCE:
			case TO_CHAR:
			case DATE_FORMAT:
			case LENGTH:
			case REVERSE:
			case IFNULL:
			case HEX:
			case CONV:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(588);
				functionList();
				setState(601);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(589);
					match(LPAREN);
					setState(598);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ALL) | (1L << NOT) | (1L << LIKE) | (1L << CHARACTER) | (1L << IF) | (1L << EXISTS) | (1L << ASC) | (1L << DESC) | (1L << ORDER) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << WHERE) | (1L << FROM) | (1L << AS) | (1L << SELECT) | (1L << DISTINCT) | (1L << INSERT) | (1L << OVERWRITE) | (1L << OUTER) | (1L << UNIQUEJOIN) | (1L << PRESERVE) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL) | (1L << ON) | (1L << PARTITION) | (1L << PARTITIONS) | (1L << TABLE) | (1L << TABLES) | (1L << COLUMNS) | (1L << INDEX) | (1L << INDEXES) | (1L << REBUILD) | (1L << FUNCTIONS) | (1L << SHOW) | (1L << MSCK) | (1L << REPAIR) | (1L << DIRECTORY) | (1L << LOCAL) | (1L << TRANSFORM) | (1L << USING) | (1L << CLUSTER) | (1L << DISTRIBUTE) | (1L << SORT) | (1L << UNION) | (1L << LOAD) | (1L << EXPORT) | (1L << IMPORT) | (1L << DATA) | (1L << INPATH) | (1L << IS) | (1L << NULL) | (1L << CREATE) | (1L << EXTERNAL) | (1L << ALTER) | (1L << CHANGE) | (1L << COLUMN) | (1L << FIRST) | (1L << AFTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DESCRIBE - 64)) | (1L << (DROP - 64)) | (1L << (RENAME - 64)) | (1L << (IGNORE - 64)) | (1L << (PROTECTION - 64)) | (1L << (TO - 64)) | (1L << (COMMENT - 64)) | (1L << (BOOLEAN - 64)) | (1L << (TINYINT - 64)) | (1L << (SMALLINT - 64)) | (1L << (INT - 64)) | (1L << (BIGINT - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (DATE - 64)) | (1L << (DATETIME - 64)) | (1L << (TIMESTAMP - 64)) | (1L << (DECIMAL - 64)) | (1L << (STRING - 64)) | (1L << (VARCHAR - 64)) | (1L << (ARRAY - 64)) | (1L << (STRUCT - 64)) | (1L << (MAP - 64)) | (1L << (UNIONTYPE - 64)) | (1L << (REDUCE - 64)) | (1L << (PARTITIONED - 64)) | (1L << (CLUSTERED - 64)) | (1L << (SORTED - 64)) | (1L << (INTO - 64)) | (1L << (BUCKETS - 64)) | (1L << (ROW - 64)) | (1L << (ROWS - 64)) | (1L << (FORMAT - 64)) | (1L << (DELIMITED - 64)) | (1L << (FIELDS - 64)) | (1L << (TERMINATED - 64)) | (1L << (ESCAPED - 64)) | (1L << (COLLECTION - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (KEY - 64)) | (1L << (LINES - 64)) | (1L << (STORED - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (SEQUENCEFILE - 64)) | (1L << (TEXTFILE - 64)) | (1L << (RCFILE - 64)) | (1L << (ORCFILE - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (OUTPUTFORMAT - 64)) | (1L << (INPUTDRIVER - 64)) | (1L << (OUTPUTDRIVER - 64)) | (1L << (OFFLINE - 64)) | (1L << (ENABLE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DISABLE - 64)) | (1L << (READONLY - 64)) | (1L << (LOCATION - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (BUCKET - 64)) | (1L << (OUT - 64)) | (1L << (OF - 64)) | (1L << (PERCENT - 64)) | (1L << (CAST - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ADD - 128)) | (1L << (REPLACE - 128)) | (1L << (RLIKE - 128)) | (1L << (REGEXP - 128)) | (1L << (TEMPORARY - 128)) | (1L << (FUNCTION - 128)) | (1L << (MACRO - 128)) | (1L << (EXPLAIN - 128)) | (1L << (EXTENDED - 128)) | (1L << (FORMATTED - 128)) | (1L << (PRETTY - 128)) | (1L << (DEPENDENCY - 128)) | (1L << (LOGICAL - 128)) | (1L << (SERDE - 128)) | (1L << (WITH - 128)) | (1L << (DEFERRED - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (LIMIT - 128)) | (1L << (SET - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (IDXPROPERTIES - 128)) | (1L << (CASCADED - 128)) | (1L << (CASE - 128)) | (1L << (WHEN - 128)) | (1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (END - 128)) | (1L << (MAPJOIN - 128)) | (1L << (STREAMTABLE - 128)) | (1L << (CLUSTERSTATUS - 128)) | (1L << (UTC - 128)) | (1L << (LONG - 128)) | (1L << (DELETE - 128)) | (1L << (FETCH - 128)) | (1L << (INTERSECT - 128)) | (1L << (VIEW - 128)) | (1L << (IN - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (GRANT - 128)) | (1L << (REVOKE - 128)) | (1L << (SSL - 128)) | (1L << (UNDO - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (UNLOCK - 128)) | (1L << (SHARED - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (PROCEDURE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (WHILE - 128)) | (1L << (READ - 128)) | (1L << (READS - 128)) | (1L << (PURGE - 128)) | (1L << (RANGE - 128)) | (1L << (ANALYZE - 128)) | (1L << (BEFORE - 128)) | (1L << (BETWEEN - 128)) | (1L << (BOTH - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BINARY - 192)) | (1L << (CROSS - 192)) | (1L << (CONTINUE - 192)) | (1L << (CURSOR - 192)) | (1L << (TRIGGER - 192)) | (1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (LATERAL - 192)) | (1L << (TOUCH - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (COMPUTE - 192)) | (1L << (STATISTICS - 192)) | (1L << (USE - 192)) | (1L << (OPTION - 192)) | (1L << (CONCATENATE - 192)) | (1L << (UPDATE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CASCADE - 192)) | (1L << (SKEWED - 192)) | (1L << (ROLLUP - 192)) | (1L << (CUBE - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (FOR - 192)) | (1L << (WINDOW - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (PRECEDING - 192)) | (1L << (FOLLOWING - 192)) | (1L << (CURRENT - 192)) | (1L << (LESS - 192)) | (1L << (MORE - 192)) | (1L << (OVER - 192)) | (1L << (GROUPING - 192)) | (1L << (SETS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (NOSCAN - 192)) | (1L << (PARTIALSCAN - 192)) | (1L << (USER - 192)) | (1L << (ROLE - 192)) | (1L << (INNER - 192)) | (1L << (EXCHANGE - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (CHAR - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ASIN - 192)) | (1L << (ATAN - 192)) | (1L << (CEIL - 192)) | (1L << (COS - 192)) | (1L << (COT - 192)) | (1L << (EXP - 192)) | (1L << (FLOOR - 192)) | (1L << (LN - 192)) | (1L << (POW - 192)) | (1L << (RAND - 192)) | (1L << (ROUND - 192)) | (1L << (SIN - 192)) | (1L << (SQRT - 192)) | (1L << (TAN - 192)) | (1L << (LCASE - 192)) | (1L << (LOWER - 192)) | (1L << (LTRIM - 192)) | (1L << (RTRIM - 192)) | (1L << (CONCAT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SUBSTR - 256)) | (1L << (TRIM - 256)) | (1L << (UCASE - 256)) | (1L << (UPPER - 256)) | (1L << (INTERVAL - 256)) | (1L << (TO_DATE - 256)) | (1L << (DAY - 256)) | (1L << (HOUR - 256)) | (1L << (MINUTE - 256)) | (1L << (MONTH - 256)) | (1L << (SECOND - 256)) | (1L << (FROM_UNIXTIME - 256)) | (1L << (YEAR - 256)) | (1L << (DATE_ADD - 256)) | (1L << (DATE_SUB - 256)) | (1L << (COLLATE - 256)) | (1L << (AVG - 256)) | (1L << (COUNT - 256)) | (1L << (MAX - 256)) | (1L << (MIN - 256)) | (1L << (SUM - 256)) | (1L << (COALESCE - 256)) | (1L << (DUPLICATE - 256)) | (1L << (SERVER - 256)) | (1L << (ALIASES - 256)) | (1L << (ALIAS - 256)) | (1L << (VALUES - 256)) | (1L << (VALUE - 256)) | (1L << (LOW_PRIORITY - 256)) | (1L << (HIGH_PRIORITY - 256)) | (1L << (HASH - 256)) | (1L << (REFERENCES - 256)) | (1L << (TO_CHAR - 256)) | (1L << (DATE_FORMAT - 256)) | (1L << (SIGNED - 256)) | (1L << (INTEGER - 256)) | (1L << (LENGTH - 256)) | (1L << (REVERSE - 256)) | (1L << (IFNULL - 256)) | (1L << (HEX - 256)) | (1L << (CONV - 256)) | (1L << (DIVIDE - 256)) | (1L << (MOD - 256)) | (1L << (OR - 256)) | (1L << (AND - 256)) | (1L << (XOR - 256)) | (1L << (ARROW - 256)) | (1L << (EQ - 256)) | (1L << (NOT_EQ - 256)) | (1L << (LET - 256)) | (1L << (GET - 256)) | (1L << (SET_VAR - 256)) | (1L << (SHIFT_LEFT - 256)) | (1L << (SHIFT_RIGHT - 256)) | (1L << (LPAREN - 256)) | (1L << (PLUS - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINUS - 320)) | (1L << (NEGATION - 320)) | (1L << (INTEGER_NUM - 320)) | (1L << (HEX_DIGIT - 320)) | (1L << (REAL_NUMBER - 320)) | (1L << (TEXT_STRING - 320)) | (1L << (ID - 320)))) != 0)) {
						{
						setState(590);
						expression();
						setState(595);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(591);
							match(COMMA);
							setState(592);
							expression();
							}
							}
							setState(597);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(600);
					match(RPAREN);
					}
					break;
				}
				}
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(603);
				match(CAST);
				setState(604);
				match(LPAREN);
				setState(605);
				expression();
				setState(606);
				match(AS);
				setState(607);
				cast_data_type();
				setState(608);
				match(RPAREN);
				}
				}
				break;
			case AVG:
			case COUNT:
			case MAX:
			case MIN:
			case SUM:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(610);
				group_functions();
				setState(611);
				match(LPAREN);
				setState(613);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(612);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(617);
				switch (_input.LA(1)) {
				case ASTERISK:
					{
					setState(615);
					match(ASTERISK);
					}
					break;
				case TRUE:
				case FALSE:
				case ALL:
				case NOT:
				case LIKE:
				case CHARACTER:
				case IF:
				case EXISTS:
				case ASC:
				case DESC:
				case ORDER:
				case GROUP:
				case BY:
				case HAVING:
				case WHERE:
				case FROM:
				case AS:
				case SELECT:
				case DISTINCT:
				case INSERT:
				case OVERWRITE:
				case OUTER:
				case UNIQUEJOIN:
				case PRESERVE:
				case JOIN:
				case LEFT:
				case RIGHT:
				case FULL:
				case ON:
				case PARTITION:
				case PARTITIONS:
				case TABLE:
				case TABLES:
				case COLUMNS:
				case INDEX:
				case INDEXES:
				case REBUILD:
				case FUNCTIONS:
				case SHOW:
				case MSCK:
				case REPAIR:
				case DIRECTORY:
				case LOCAL:
				case TRANSFORM:
				case USING:
				case CLUSTER:
				case DISTRIBUTE:
				case SORT:
				case UNION:
				case LOAD:
				case EXPORT:
				case IMPORT:
				case DATA:
				case INPATH:
				case IS:
				case NULL:
				case CREATE:
				case EXTERNAL:
				case ALTER:
				case CHANGE:
				case COLUMN:
				case FIRST:
				case AFTER:
				case DESCRIBE:
				case DROP:
				case RENAME:
				case IGNORE:
				case PROTECTION:
				case TO:
				case COMMENT:
				case BOOLEAN:
				case TINYINT:
				case SMALLINT:
				case INT:
				case BIGINT:
				case FLOAT:
				case DOUBLE:
				case DATE:
				case DATETIME:
				case TIMESTAMP:
				case DECIMAL:
				case STRING:
				case VARCHAR:
				case ARRAY:
				case STRUCT:
				case MAP:
				case UNIONTYPE:
				case REDUCE:
				case PARTITIONED:
				case CLUSTERED:
				case SORTED:
				case INTO:
				case BUCKETS:
				case ROW:
				case ROWS:
				case FORMAT:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case ESCAPED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case KEY:
				case LINES:
				case STORED:
				case FILEFORMAT:
				case SEQUENCEFILE:
				case TEXTFILE:
				case RCFILE:
				case ORCFILE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case INPUTDRIVER:
				case OUTPUTDRIVER:
				case OFFLINE:
				case ENABLE:
				case DEFAULT:
				case DISABLE:
				case READONLY:
				case LOCATION:
				case TABLESAMPLE:
				case BUCKET:
				case OUT:
				case OF:
				case PERCENT:
				case CAST:
				case ADD:
				case REPLACE:
				case RLIKE:
				case REGEXP:
				case TEMPORARY:
				case FUNCTION:
				case MACRO:
				case EXPLAIN:
				case EXTENDED:
				case FORMATTED:
				case PRETTY:
				case DEPENDENCY:
				case LOGICAL:
				case SERDE:
				case WITH:
				case DEFERRED:
				case SERDEPROPERTIES:
				case DBPROPERTIES:
				case LIMIT:
				case SET:
				case UNSET:
				case TBLPROPERTIES:
				case IDXPROPERTIES:
				case CASCADED:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case MAPJOIN:
				case STREAMTABLE:
				case CLUSTERSTATUS:
				case UTC:
				case LONG:
				case DELETE:
				case FETCH:
				case INTERSECT:
				case VIEW:
				case IN:
				case DATABASE:
				case DATABASES:
				case MATERIALIZED:
				case SCHEMA:
				case SCHEMAS:
				case GRANT:
				case REVOKE:
				case SSL:
				case UNDO:
				case LOCK:
				case LOCKS:
				case UNLOCK:
				case SHARED:
				case EXCLUSIVE:
				case PROCEDURE:
				case UNSIGNED:
				case WHILE:
				case READ:
				case READS:
				case PURGE:
				case RANGE:
				case ANALYZE:
				case BEFORE:
				case BETWEEN:
				case BOTH:
				case BINARY:
				case CROSS:
				case CONTINUE:
				case CURSOR:
				case TRIGGER:
				case RECORDREADER:
				case RECORDWRITER:
				case LATERAL:
				case TOUCH:
				case ARCHIVE:
				case UNARCHIVE:
				case COMPUTE:
				case STATISTICS:
				case USE:
				case OPTION:
				case CONCATENATE:
				case UPDATE:
				case RESTRICT:
				case CASCADE:
				case SKEWED:
				case ROLLUP:
				case CUBE:
				case DIRECTORIES:
				case FOR:
				case WINDOW:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case LESS:
				case MORE:
				case OVER:
				case GROUPING:
				case SETS:
				case TRUNCATE:
				case NOSCAN:
				case PARTIALSCAN:
				case USER:
				case ROLE:
				case INNER:
				case EXCHANGE:
				case IDENTIFIED:
				case CHAR:
				case ABS:
				case ACOS:
				case ASIN:
				case ATAN:
				case CEIL:
				case COS:
				case COT:
				case EXP:
				case FLOOR:
				case LN:
				case POW:
				case RAND:
				case ROUND:
				case SIN:
				case SQRT:
				case TAN:
				case LCASE:
				case LOWER:
				case LTRIM:
				case RTRIM:
				case CONCAT:
				case SUBSTR:
				case TRIM:
				case UCASE:
				case UPPER:
				case INTERVAL:
				case TO_DATE:
				case DAY:
				case HOUR:
				case MINUTE:
				case MONTH:
				case SECOND:
				case FROM_UNIXTIME:
				case YEAR:
				case DATE_ADD:
				case DATE_SUB:
				case COLLATE:
				case AVG:
				case COUNT:
				case MAX:
				case MIN:
				case SUM:
				case COALESCE:
				case DUPLICATE:
				case SERVER:
				case ALIASES:
				case ALIAS:
				case VALUES:
				case VALUE:
				case LOW_PRIORITY:
				case HIGH_PRIORITY:
				case HASH:
				case REFERENCES:
				case TO_CHAR:
				case DATE_FORMAT:
				case SIGNED:
				case INTEGER:
				case LENGTH:
				case REVERSE:
				case IFNULL:
				case HEX:
				case CONV:
				case DIVIDE:
				case MOD:
				case OR:
				case AND:
				case XOR:
				case ARROW:
				case EQ:
				case NOT_EQ:
				case LET:
				case GET:
				case SET_VAR:
				case SHIFT_LEFT:
				case SHIFT_RIGHT:
				case LPAREN:
				case PLUS:
				case MINUS:
				case NEGATION:
				case INTEGER_NUM:
				case HEX_DIGIT:
				case REAL_NUMBER:
				case TEXT_STRING:
				case ID:
					{
					setState(616);
					bit_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(619);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statementContext extends ParserRuleContext {
		public Case_when_statement1Context case_when_statement1() {
			return getRuleContext(Case_when_statement1Context.class,0);
		}
		public Case_when_statement2Context case_when_statement2() {
			return getRuleContext(Case_when_statement2Context.class,0);
		}
		public Case_when_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCase_when_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_when_statementContext case_when_statement() throws RecognitionException {
		Case_when_statementContext _localctx = new Case_when_statementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_case_when_statement);
		try {
			setState(625);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				case_when_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				case_when_statement2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statement1Context extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(uniformSQLParser.CASE, 0); }
		public TerminalNode END() { return getToken(uniformSQLParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(uniformSQLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(uniformSQLParser.WHEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(uniformSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(uniformSQLParser.THEN, i);
		}
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(uniformSQLParser.ELSE, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Case_when_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCase_when_statement1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_when_statement1Context case_when_statement1() throws RecognitionException {
		Case_when_statement1Context _localctx = new Case_when_statement1Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_case_when_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(CASE);
			setState(633); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(628);
				match(WHEN);
				setState(629);
				expression();
				setState(630);
				match(THEN);
				setState(631);
				bit_expr();
				}
				}
				setState(635); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(639);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(637);
				match(ELSE);
				setState(638);
				bit_expr();
				}
			}

			setState(641);
			match(END);
			setState(643);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(642);
				alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_when_statement2Context extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(uniformSQLParser.CASE, 0); }
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public TerminalNode END() { return getToken(uniformSQLParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(uniformSQLParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(uniformSQLParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(uniformSQLParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(uniformSQLParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(uniformSQLParser.ELSE, 0); }
		public Case_when_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when_statement2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCase_when_statement2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_when_statement2Context case_when_statement2() throws RecognitionException {
		Case_when_statement2Context _localctx = new Case_when_statement2Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_case_when_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(CASE);
			setState(646);
			bit_expr();
			setState(652); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(647);
				match(WHEN);
				setState(648);
				bit_expr();
				setState(649);
				match(THEN);
				setState(650);
				bit_expr();
				}
				}
				setState(654); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(658);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(656);
				match(ELSE);
				setState(657);
				bit_expr();
				}
			}

			setState(660);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_specContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public Column_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_specContext column_spec() throws RecognitionException {
		Column_specContext _localctx = new Column_specContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(662);
				table_spec();
				setState(663);
				match(DOT);
				}
				break;
			}
			setState(667);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_expression_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(uniformSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(uniformSQLParser.OR, i);
		}
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(uniformSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(uniformSQLParser.AND, i);
		}
		public Raw_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRaw_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_expression_listContext raw_expression_list() throws RecognitionException {
		Raw_expression_listContext _localctx = new Raw_expression_listContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_raw_expression_list);
		try {
			int _alt;
			setState(683);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				column_name();
				setState(672); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(670);
						match(OR);
						setState(671);
						column_spec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(674); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				column_name();
				setState(679); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(677);
						match(AND);
						setState(678);
						column_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(681); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(LPAREN);
			setState(686);
			expression();
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(687);
				match(COMMA);
				setState(688);
				expression();
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(694);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_exprContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(uniformSQLParser.INTERVAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Interval_unitContext interval_unit() {
			return getRuleContext(Interval_unitContext.class,0);
		}
		public Interval_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInterval_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_exprContext interval_expr() throws RecognitionException {
		Interval_exprContext _localctx = new Interval_exprContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_interval_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(INTERVAL);
			setState(697);
			expression();
			setState(698);
			interval_unit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referencesContext extends ParserRuleContext {
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_references(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			table_reference();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(701);
				match(COMMA);
				setState(702);
				table_reference();
				}
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_referenceContext extends ParserRuleContext {
		public Table_factor1Context table_factor1() {
			return getRuleContext(Table_factor1Context.class,0);
		}
		public Table_atomContext table_atom() {
			return getRuleContext(Table_atomContext.class,0);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_table_reference);
		try {
			setState(710);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				table_factor1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				table_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor1Context extends ParserRuleContext {
		public Table_factor2Context table_factor2() {
			return getRuleContext(Table_factor2Context.class,0);
		}
		public List<TerminalNode> JOIN() { return getTokens(uniformSQLParser.JOIN); }
		public TerminalNode JOIN(int i) {
			return getToken(uniformSQLParser.JOIN, i);
		}
		public List<Table_atomContext> table_atom() {
			return getRuleContexts(Table_atomContext.class);
		}
		public Table_atomContext table_atom(int i) {
			return getRuleContext(Table_atomContext.class,i);
		}
		public List<Join_conditionContext> join_condition() {
			return getRuleContexts(Join_conditionContext.class);
		}
		public Join_conditionContext join_condition(int i) {
			return getRuleContext(Join_conditionContext.class,i);
		}
		public List<TerminalNode> CROSS() { return getTokens(uniformSQLParser.CROSS); }
		public TerminalNode CROSS(int i) {
			return getToken(uniformSQLParser.CROSS, i);
		}
		public List<TerminalNode> INNER() { return getTokens(uniformSQLParser.INNER); }
		public TerminalNode INNER(int i) {
			return getToken(uniformSQLParser.INNER, i);
		}
		public Table_factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_factor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factor1Context table_factor1() throws RecognitionException {
		Table_factor1Context _localctx = new Table_factor1Context(_ctx, getState());
		enterRule(_localctx, 140, RULE_table_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			table_factor2();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JOIN || _la==CROSS || _la==INNER) {
				{
				{
				setState(714);
				_la = _input.LA(1);
				if (_la==CROSS || _la==INNER) {
					{
					setState(713);
					_la = _input.LA(1);
					if ( !(_la==CROSS || _la==INNER) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(716);
				match(JOIN);
				setState(717);
				table_atom();
				setState(719);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(718);
					join_condition();
					}
				}

				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor2Context extends ParserRuleContext {
		public List<Table_factor3Context> table_factor3() {
			return getRuleContexts(Table_factor3Context.class);
		}
		public Table_factor3Context table_factor3(int i) {
			return getRuleContext(Table_factor3Context.class,i);
		}
		public List<TerminalNode> JOIN() { return getTokens(uniformSQLParser.JOIN); }
		public TerminalNode JOIN(int i) {
			return getToken(uniformSQLParser.JOIN, i);
		}
		public List<Join_conditionContext> join_condition() {
			return getRuleContexts(Join_conditionContext.class);
		}
		public Join_conditionContext join_condition(int i) {
			return getRuleContext(Join_conditionContext.class,i);
		}
		public List<TerminalNode> LEFT() { return getTokens(uniformSQLParser.LEFT); }
		public TerminalNode LEFT(int i) {
			return getToken(uniformSQLParser.LEFT, i);
		}
		public List<TerminalNode> RIGHT() { return getTokens(uniformSQLParser.RIGHT); }
		public TerminalNode RIGHT(int i) {
			return getToken(uniformSQLParser.RIGHT, i);
		}
		public List<TerminalNode> FULL() { return getTokens(uniformSQLParser.FULL); }
		public TerminalNode FULL(int i) {
			return getToken(uniformSQLParser.FULL, i);
		}
		public List<TerminalNode> OUTER() { return getTokens(uniformSQLParser.OUTER); }
		public TerminalNode OUTER(int i) {
			return getToken(uniformSQLParser.OUTER, i);
		}
		public Table_factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_factor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factor2Context table_factor2() throws RecognitionException {
		Table_factor2Context _localctx = new Table_factor2Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_table_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			table_factor3();
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
				{
				{
				setState(727);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(729);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(728);
					match(OUTER);
					}
				}

				setState(731);
				match(JOIN);
				setState(732);
				table_factor3();
				setState(733);
				join_condition();
				}
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_factor3Context extends ParserRuleContext {
		public List<Table_atomContext> table_atom() {
			return getRuleContexts(Table_atomContext.class);
		}
		public Table_atomContext table_atom(int i) {
			return getRuleContext(Table_atomContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(uniformSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(uniformSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(uniformSQLParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(uniformSQLParser.OUTER, 0); }
		public Table_factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_factor3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_factor3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_factor3Context table_factor3() throws RecognitionException {
		Table_factor3Context _localctx = new Table_factor3Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_table_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			table_atom();
			setState(749);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(745);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
					{
					setState(741);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(743);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(742);
						match(OUTER);
						}
					}

					}
				}

				setState(747);
				match(JOIN);
				setState(748);
				table_atom();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_atomContext extends ParserRuleContext {
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(uniformSQLParser.ID, 0); }
		public Table_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_atomContext table_atom() throws RecognitionException {
		Table_atomContext _localctx = new Table_atomContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_table_atom);
		try {
			setState(764);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(751);
				table_spec();
				setState(753);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(752);
					alias();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(755);
				subquery();
				setState(757);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(756);
					alias();
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(759);
				match(LPAREN);
				setState(760);
				table_references();
				setState(761);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(763);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_conditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Join_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitJoin_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_conditionContext join_condition() throws RecognitionException {
		Join_conditionContext _localctx = new Join_conditionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(ON);
			setState(767);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hint_listContext extends ParserRuleContext {
		public List<Index_hintContext> index_hint() {
			return getRuleContexts(Index_hintContext.class);
		}
		public Index_hintContext index_hint(int i) {
			return getRuleContext(Index_hintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Index_hint_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_hint_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_hint_listContext index_hint_list() throws RecognitionException {
		Index_hint_listContext _localctx = new Index_hint_listContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_index_hint_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			index_hint();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(770);
				match(COMMA);
				setState(771);
				index_hint();
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(uniformSQLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public TerminalNode FOR() { return getToken(uniformSQLParser.FOR, 0); }
		public TerminalNode JOIN() { return getToken(uniformSQLParser.JOIN, 0); }
		public TerminalNode ORDER() { return getToken(uniformSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(uniformSQLParser.GROUP, 0); }
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(786);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(778);
				match(FOR);
				setState(784);
				switch (_input.LA(1)) {
				case JOIN:
					{
					{
					setState(779);
					match(JOIN);
					}
					}
					break;
				case ORDER:
					{
					{
					setState(780);
					match(ORDER);
					setState(781);
					match(BY);
					}
					}
					break;
				case GROUP:
					{
					{
					setState(782);
					match(GROUP);
					setState(783);
					match(BY);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_hintContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(uniformSQLParser.USE, 0); }
		public Index_optionsContext index_options() {
			return getRuleContext(Index_optionsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Index_listContext index_list() {
			return getRuleContext(Index_listContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(uniformSQLParser.IGNORE, 0); }
		public Index_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_hint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_hintContext index_hint() throws RecognitionException {
		Index_hintContext _localctx = new Index_hintContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_index_hint);
		int _la;
		try {
			setState(802);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(USE);
				setState(789);
				index_options();
				setState(790);
				match(LPAREN);
				setState(792);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ALL) | (1L << NOT) | (1L << LIKE) | (1L << CHARACTER) | (1L << IF) | (1L << EXISTS) | (1L << ASC) | (1L << DESC) | (1L << ORDER) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << WHERE) | (1L << FROM) | (1L << AS) | (1L << SELECT) | (1L << DISTINCT) | (1L << INSERT) | (1L << OVERWRITE) | (1L << OUTER) | (1L << UNIQUEJOIN) | (1L << PRESERVE) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL) | (1L << ON) | (1L << PARTITION) | (1L << PARTITIONS) | (1L << TABLE) | (1L << TABLES) | (1L << COLUMNS) | (1L << INDEX) | (1L << INDEXES) | (1L << REBUILD) | (1L << FUNCTIONS) | (1L << SHOW) | (1L << MSCK) | (1L << REPAIR) | (1L << DIRECTORY) | (1L << LOCAL) | (1L << TRANSFORM) | (1L << USING) | (1L << CLUSTER) | (1L << DISTRIBUTE) | (1L << SORT) | (1L << UNION) | (1L << LOAD) | (1L << EXPORT) | (1L << IMPORT) | (1L << DATA) | (1L << INPATH) | (1L << IS) | (1L << NULL) | (1L << CREATE) | (1L << EXTERNAL) | (1L << ALTER) | (1L << CHANGE) | (1L << COLUMN) | (1L << FIRST) | (1L << AFTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DESCRIBE - 64)) | (1L << (DROP - 64)) | (1L << (RENAME - 64)) | (1L << (IGNORE - 64)) | (1L << (PROTECTION - 64)) | (1L << (TO - 64)) | (1L << (COMMENT - 64)) | (1L << (BOOLEAN - 64)) | (1L << (TINYINT - 64)) | (1L << (SMALLINT - 64)) | (1L << (INT - 64)) | (1L << (BIGINT - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (DATE - 64)) | (1L << (DATETIME - 64)) | (1L << (TIMESTAMP - 64)) | (1L << (DECIMAL - 64)) | (1L << (STRING - 64)) | (1L << (VARCHAR - 64)) | (1L << (ARRAY - 64)) | (1L << (STRUCT - 64)) | (1L << (MAP - 64)) | (1L << (UNIONTYPE - 64)) | (1L << (REDUCE - 64)) | (1L << (PARTITIONED - 64)) | (1L << (CLUSTERED - 64)) | (1L << (SORTED - 64)) | (1L << (INTO - 64)) | (1L << (BUCKETS - 64)) | (1L << (ROW - 64)) | (1L << (ROWS - 64)) | (1L << (FORMAT - 64)) | (1L << (DELIMITED - 64)) | (1L << (FIELDS - 64)) | (1L << (TERMINATED - 64)) | (1L << (ESCAPED - 64)) | (1L << (COLLECTION - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (KEY - 64)) | (1L << (LINES - 64)) | (1L << (STORED - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (SEQUENCEFILE - 64)) | (1L << (TEXTFILE - 64)) | (1L << (RCFILE - 64)) | (1L << (ORCFILE - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (OUTPUTFORMAT - 64)) | (1L << (INPUTDRIVER - 64)) | (1L << (OUTPUTDRIVER - 64)) | (1L << (OFFLINE - 64)) | (1L << (ENABLE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DISABLE - 64)) | (1L << (READONLY - 64)) | (1L << (LOCATION - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (BUCKET - 64)) | (1L << (OUT - 64)) | (1L << (OF - 64)) | (1L << (PERCENT - 64)) | (1L << (CAST - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ADD - 128)) | (1L << (REPLACE - 128)) | (1L << (RLIKE - 128)) | (1L << (REGEXP - 128)) | (1L << (TEMPORARY - 128)) | (1L << (FUNCTION - 128)) | (1L << (MACRO - 128)) | (1L << (EXPLAIN - 128)) | (1L << (EXTENDED - 128)) | (1L << (FORMATTED - 128)) | (1L << (PRETTY - 128)) | (1L << (DEPENDENCY - 128)) | (1L << (LOGICAL - 128)) | (1L << (SERDE - 128)) | (1L << (WITH - 128)) | (1L << (DEFERRED - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (LIMIT - 128)) | (1L << (SET - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (IDXPROPERTIES - 128)) | (1L << (CASCADED - 128)) | (1L << (CASE - 128)) | (1L << (WHEN - 128)) | (1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (END - 128)) | (1L << (MAPJOIN - 128)) | (1L << (STREAMTABLE - 128)) | (1L << (CLUSTERSTATUS - 128)) | (1L << (UTC - 128)) | (1L << (LONG - 128)) | (1L << (DELETE - 128)) | (1L << (FETCH - 128)) | (1L << (INTERSECT - 128)) | (1L << (VIEW - 128)) | (1L << (IN - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (GRANT - 128)) | (1L << (REVOKE - 128)) | (1L << (SSL - 128)) | (1L << (UNDO - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (UNLOCK - 128)) | (1L << (SHARED - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (PROCEDURE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (WHILE - 128)) | (1L << (READ - 128)) | (1L << (READS - 128)) | (1L << (PURGE - 128)) | (1L << (RANGE - 128)) | (1L << (ANALYZE - 128)) | (1L << (BEFORE - 128)) | (1L << (BETWEEN - 128)) | (1L << (BOTH - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BINARY - 192)) | (1L << (CROSS - 192)) | (1L << (CONTINUE - 192)) | (1L << (CURSOR - 192)) | (1L << (TRIGGER - 192)) | (1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (LATERAL - 192)) | (1L << (TOUCH - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (COMPUTE - 192)) | (1L << (STATISTICS - 192)) | (1L << (USE - 192)) | (1L << (OPTION - 192)) | (1L << (CONCATENATE - 192)) | (1L << (UPDATE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CASCADE - 192)) | (1L << (SKEWED - 192)) | (1L << (ROLLUP - 192)) | (1L << (CUBE - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (FOR - 192)) | (1L << (WINDOW - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (PRECEDING - 192)) | (1L << (FOLLOWING - 192)) | (1L << (CURRENT - 192)) | (1L << (LESS - 192)) | (1L << (MORE - 192)) | (1L << (OVER - 192)) | (1L << (GROUPING - 192)) | (1L << (SETS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (NOSCAN - 192)) | (1L << (PARTIALSCAN - 192)) | (1L << (USER - 192)) | (1L << (ROLE - 192)) | (1L << (INNER - 192)) | (1L << (EXCHANGE - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (CHAR - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ASIN - 192)) | (1L << (ATAN - 192)) | (1L << (CEIL - 192)) | (1L << (COS - 192)) | (1L << (COT - 192)) | (1L << (EXP - 192)) | (1L << (FLOOR - 192)) | (1L << (LN - 192)) | (1L << (POW - 192)) | (1L << (RAND - 192)) | (1L << (ROUND - 192)) | (1L << (SIN - 192)) | (1L << (SQRT - 192)) | (1L << (TAN - 192)) | (1L << (LCASE - 192)) | (1L << (LOWER - 192)) | (1L << (LTRIM - 192)) | (1L << (RTRIM - 192)) | (1L << (CONCAT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (SUBSTR - 256)) | (1L << (TRIM - 256)) | (1L << (UCASE - 256)) | (1L << (UPPER - 256)) | (1L << (INTERVAL - 256)) | (1L << (TO_DATE - 256)) | (1L << (DAY - 256)) | (1L << (HOUR - 256)) | (1L << (MINUTE - 256)) | (1L << (MONTH - 256)) | (1L << (SECOND - 256)) | (1L << (FROM_UNIXTIME - 256)) | (1L << (YEAR - 256)) | (1L << (DATE_ADD - 256)) | (1L << (DATE_SUB - 256)) | (1L << (COLLATE - 256)) | (1L << (AVG - 256)) | (1L << (COUNT - 256)) | (1L << (MAX - 256)) | (1L << (MIN - 256)) | (1L << (SUM - 256)) | (1L << (COALESCE - 256)) | (1L << (DUPLICATE - 256)) | (1L << (SERVER - 256)) | (1L << (ALIASES - 256)) | (1L << (ALIAS - 256)) | (1L << (VALUES - 256)) | (1L << (VALUE - 256)) | (1L << (LOW_PRIORITY - 256)) | (1L << (HIGH_PRIORITY - 256)) | (1L << (HASH - 256)) | (1L << (REFERENCES - 256)) | (1L << (TO_CHAR - 256)) | (1L << (DATE_FORMAT - 256)) | (1L << (SIGNED - 256)) | (1L << (INTEGER - 256)) | (1L << (LENGTH - 256)) | (1L << (REVERSE - 256)) | (1L << (IFNULL - 256)) | (1L << (HEX - 256)) | (1L << (CONV - 256)) | (1L << (DIVIDE - 256)) | (1L << (MOD - 256)) | (1L << (OR - 256)) | (1L << (AND - 256)) | (1L << (XOR - 256)) | (1L << (ARROW - 256)) | (1L << (EQ - 256)) | (1L << (NOT_EQ - 256)) | (1L << (LET - 256)) | (1L << (GET - 256)) | (1L << (SET_VAR - 256)) | (1L << (SHIFT_LEFT - 256)) | (1L << (SHIFT_RIGHT - 256)))) != 0) || _la==TEXT_STRING || _la==ID) {
					{
					setState(791);
					index_list();
					}
				}

				setState(794);
				match(RPAREN);
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				match(IGNORE);
				setState(797);
				index_options();
				setState(798);
				match(LPAREN);
				setState(799);
				index_list();
				setState(800);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_listContext extends ParserRuleContext {
		public List<Index_nameContext> index_name() {
			return getRuleContexts(Index_nameContext.class);
		}
		public Index_nameContext index_name(int i) {
			return getRuleContext(Index_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Index_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_listContext index_list() throws RecognitionException {
		Index_listContext _localctx = new Index_listContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			index_name();
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(805);
				match(COMMA);
				setState(806);
				index_name();
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_clauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(uniformSQLParser.PARTITION, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Partition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPartition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_clauseContext partition_clause() throws RecognitionException {
		Partition_clauseContext _localctx = new Partition_clauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(PARTITION);
			setState(813);
			match(LPAREN);
			setState(814);
			partition_names();
			setState(815);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_namesContext extends ParserRuleContext {
		public List<Partition_nameContext> partition_name() {
			return getRuleContexts(Partition_nameContext.class);
		}
		public Partition_nameContext partition_name(int i) {
			return getRuleContext(Partition_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Partition_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPartition_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_namesContext partition_names() throws RecognitionException {
		Partition_namesContext _localctx = new Partition_namesContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			partition_name();
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(818);
				match(COMMA);
				setState(819);
				partition_name();
				}
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Root_statementContext extends ParserRuleContext {
		public Data_manipulation_statementsContext data_manipulation_statements() {
			return getRuleContext(Data_manipulation_statementsContext.class,0);
		}
		public Data_definition_statementsContext data_definition_statements() {
			return getRuleContext(Data_definition_statementsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(uniformSQLParser.SEMI, 0); }
		public Root_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRoot_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Root_statementContext root_statement() throws RecognitionException {
		Root_statementContext _localctx = new Root_statementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_root_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case DELETE:
			case UPDATE:
			case SERVER:
			case LPAREN:
				{
				setState(825);
				data_manipulation_statements();
				}
				break;
			case SHOW:
			case CREATE:
			case ALTER:
			case DROP:
			case SET:
			case GRANT:
			case REVOKE:
			case USE:
				{
				setState(826);
				data_definition_statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(830);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(829);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_manipulation_statementsContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Update_statementsContext update_statements() {
			return getRuleContext(Update_statementsContext.class,0);
		}
		public Delete_statementsContext delete_statements() {
			return getRuleContext(Delete_statementsContext.class,0);
		}
		public Server_event_statementContext server_event_statement() {
			return getRuleContext(Server_event_statementContext.class,0);
		}
		public Data_manipulation_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_manipulation_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitData_manipulation_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_manipulation_statementsContext data_manipulation_statements() throws RecognitionException {
		Data_manipulation_statementsContext _localctx = new Data_manipulation_statementsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_data_manipulation_statements);
		try {
			setState(837);
			switch (_input.LA(1)) {
			case SELECT:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				select_statement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				insert_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				update_statements();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(835);
				delete_statements();
				}
				break;
			case SERVER:
				enterOuterAlt(_localctx, 5);
				{
				setState(836);
				server_event_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_definition_statementsContext extends ParserRuleContext {
		public Create_statementContext create_statement() {
			return getRuleContext(Create_statementContext.class,0);
		}
		public Drop_statementContext drop_statement() {
			return getRuleContext(Drop_statementContext.class,0);
		}
		public Privilege_alter_statementContext privilege_alter_statement() {
			return getRuleContext(Privilege_alter_statementContext.class,0);
		}
		public Show_event_statementContext show_event_statement() {
			return getRuleContext(Show_event_statementContext.class,0);
		}
		public Set_event_statementContext set_event_statement() {
			return getRuleContext(Set_event_statementContext.class,0);
		}
		public Use_event_statementContext use_event_statement() {
			return getRuleContext(Use_event_statementContext.class,0);
		}
		public Data_definition_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_definition_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitData_definition_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_definition_statementsContext data_definition_statements() throws RecognitionException {
		Data_definition_statementsContext _localctx = new Data_definition_statementsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_data_definition_statements);
		try {
			setState(845);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				create_statement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				drop_statement();
				}
				break;
			case ALTER:
			case GRANT:
			case REVOKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(841);
				privilege_alter_statement();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 4);
				{
				setState(842);
				show_event_statement();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(843);
				set_event_statement();
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 6);
				{
				setState(844);
				use_event_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_statementContext extends ParserRuleContext {
		public Create_database_statementContext create_database_statement() {
			return getRuleContext(Create_database_statementContext.class,0);
		}
		public Create_user_statementContext create_user_statement() {
			return getRuleContext(Create_user_statementContext.class,0);
		}
		public Create_table_statementContext create_table_statement() {
			return getRuleContext(Create_table_statementContext.class,0);
		}
		public Create_view_statementContext create_view_statement() {
			return getRuleContext(Create_view_statementContext.class,0);
		}
		public Create_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_statementContext create_statement() throws RecognitionException {
		Create_statementContext _localctx = new Create_statementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_create_statement);
		try {
			setState(851);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				create_database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				create_user_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(849);
				create_table_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(850);
				create_view_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_statementContext extends ParserRuleContext {
		public Drop_database_statementContext drop_database_statement() {
			return getRuleContext(Drop_database_statementContext.class,0);
		}
		public Drop_user_statementContext drop_user_statement() {
			return getRuleContext(Drop_user_statementContext.class,0);
		}
		public Drop_table_statementContext drop_table_statement() {
			return getRuleContext(Drop_table_statementContext.class,0);
		}
		public Drop_view_statementContext drop_view_statement() {
			return getRuleContext(Drop_view_statementContext.class,0);
		}
		public Drop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDrop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_statementContext drop_statement() throws RecognitionException {
		Drop_statementContext _localctx = new Drop_statementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_drop_statement);
		try {
			setState(857);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				drop_database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				drop_user_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(855);
				drop_table_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(856);
				drop_view_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Privilege_alter_statementContext extends ParserRuleContext {
		public Grant_privilege_statementContext grant_privilege_statement() {
			return getRuleContext(Grant_privilege_statementContext.class,0);
		}
		public Revoke_privilege_statementContext revoke_privilege_statement() {
			return getRuleContext(Revoke_privilege_statementContext.class,0);
		}
		public Alter_table_statementContext alter_table_statement() {
			return getRuleContext(Alter_table_statementContext.class,0);
		}
		public Alter_view_statementContext alter_view_statement() {
			return getRuleContext(Alter_view_statementContext.class,0);
		}
		public Privilege_alter_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege_alter_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPrivilege_alter_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Privilege_alter_statementContext privilege_alter_statement() throws RecognitionException {
		Privilege_alter_statementContext _localctx = new Privilege_alter_statementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_privilege_alter_statement);
		try {
			setState(863);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				grant_privilege_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				revoke_privilege_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(861);
				alter_table_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(862);
				alter_view_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public List<Select_expressionContext> select_expression() {
			return getRuleContexts(Select_expressionContext.class);
		}
		public Select_expressionContext select_expression(int i) {
			return getRuleContext(Select_expressionContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(uniformSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(uniformSQLParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(uniformSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(uniformSQLParser.RPAREN, i);
		}
		public List<TerminalNode> UNION() { return getTokens(uniformSQLParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(uniformSQLParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(uniformSQLParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(uniformSQLParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(uniformSQLParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(uniformSQLParser.DISTINCT, i);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(865);
				match(LPAREN);
				}
			}

			setState(868);
			select_expression();
			setState(870);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(869);
				match(RPAREN);
				}
				break;
			}
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(872);
				match(UNION);
				setState(874);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(873);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(877);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(876);
					match(LPAREN);
					}
				}

				setState(879);
				select_expression();
				setState(881);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(880);
					match(RPAREN);
					}
					break;
				}
				}
				}
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_expressionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(uniformSQLParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(uniformSQLParser.FROM, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(uniformSQLParser.DISTINCT, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Select_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSelect_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_expressionContext select_expression() throws RecognitionException {
		Select_expressionContext _localctx = new Select_expressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_select_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(SELECT);
			setState(890);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(889);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(892);
			select_list();
			setState(904);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(893);
				match(FROM);
				setState(894);
				table_references();
				setState(896);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(895);
					where_clause();
					}
				}

				setState(899);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(898);
					groupby_clause();
					}
				}

				setState(902);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(901);
					having_clause();
					}
				}

				}
			}

			setState(907);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(906);
				orderby_clause();
				}
			}

			setState(910);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(909);
				limit_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(uniformSQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(WHERE);
			setState(913);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_clauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(uniformSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public List<Groupby_itemContext> groupby_item() {
			return getRuleContexts(Groupby_itemContext.class);
		}
		public Groupby_itemContext groupby_item(int i) {
			return getRuleContext(Groupby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitGroupby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(GROUP);
			setState(916);
			match(BY);
			setState(917);
			groupby_item();
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(918);
				match(COMMA);
				setState(919);
				groupby_item();
				}
				}
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_itemContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public Groupby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitGroupby_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Groupby_itemContext groupby_item() throws RecognitionException {
		Groupby_itemContext _localctx = new Groupby_itemContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_groupby_item);
		try {
			setState(928);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				column_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(INTEGER_NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				bit_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(uniformSQLParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(HAVING);
			setState(931);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(uniformSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public List<Orderby_itemContext> orderby_item() {
			return getRuleContexts(Orderby_itemContext.class);
		}
		public Orderby_itemContext orderby_item(int i) {
			return getRuleContext(Orderby_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitOrderby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(ORDER);
			setState(934);
			match(BY);
			setState(935);
			orderby_item();
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(936);
				match(COMMA);
				setState(937);
				orderby_item();
				}
				}
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_itemContext extends ParserRuleContext {
		public Groupby_itemContext groupby_item() {
			return getRuleContext(Groupby_itemContext.class,0);
		}
		public TerminalNode ASC() { return getToken(uniformSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(uniformSQLParser.DESC, 0); }
		public Orderby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitOrderby_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_itemContext orderby_item() throws RecognitionException {
		Orderby_itemContext _localctx = new Orderby_itemContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			groupby_item();
			setState(945);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(944);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(uniformSQLParser.LIMIT, 0); }
		public Row_countContext row_count() {
			return getRuleContext(Row_countContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(uniformSQLParser.COMMA, 0); }
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitLimit_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(LIMIT);
			{
			setState(951);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(948);
				offset();
				setState(949);
				match(COMMA);
				}
				break;
			}
			setState(953);
			row_count();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Row_countContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public Row_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_count; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRow_count(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Row_countContext row_count() throws RecognitionException {
		Row_countContext _localctx = new Row_countContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_row_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Displayed_columnContext> displayed_column() {
			return getRuleContexts(Displayed_columnContext.class);
		}
		public Displayed_columnContext displayed_column(int i) {
			return getRuleContext(Displayed_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			displayed_column();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(960);
				match(COMMA);
				setState(961);
				displayed_column();
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(LPAREN);
			setState(968);
			column_spec();
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(969);
				match(COMMA);
				setState(970);
				column_spec();
				}
				}
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(976);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(LPAREN);
			setState(979);
			select_statement();
			setState(980);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_specContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public Table_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTable_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_specContext table_spec() throws RecognitionException {
		Table_specContext _localctx = new Table_specContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(982);
				schema_name();
				setState(983);
				match(DOT);
				}
				break;
			}
			setState(987);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Displayed_columnContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public Displayed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayed_column; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDisplayed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Displayed_columnContext displayed_column() throws RecognitionException {
		Displayed_columnContext _localctx = new Displayed_columnContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_displayed_column);
		try {
			setState(1002);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				table_spec();
				setState(991);
				match(DOT);
				setState(992);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(994);
				column_spec();
				setState(996);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(995);
					alias();
					}
					break;
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(998);
				bit_expr();
				setState(1000);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(999);
					alias();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public Insert_headerContext insert_header() {
			return getRuleContext(Insert_headerContext.class,0);
		}
		public Select_expressionContext select_expression() {
			return getRuleContext(Select_expressionContext.class,0);
		}
		public Value_list_clauseContext value_list_clause() {
			return getRuleContext(Value_list_clauseContext.class,0);
		}
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInsert_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			insert_header();
			setState(1006);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1005);
				column_list();
				}
			}

			setState(1010);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1008);
				select_expression();
				}
				break;
			case VALUES:
			case VALUE:
				{
				setState(1009);
				value_list_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_headerContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(uniformSQLParser.INSERT, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode INTO() { return getToken(uniformSQLParser.INTO, 0); }
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public Insert_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInsert_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_headerContext insert_header() throws RecognitionException {
		Insert_headerContext _localctx = new Insert_headerContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_insert_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(INSERT);
			setState(1014);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1013);
				match(INTO);
				}
				break;
			}
			setState(1016);
			table_spec();
			setState(1018);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1017);
				partition_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_list_clauseContext extends ParserRuleContext {
		public List<Column_value_listContext> column_value_list() {
			return getRuleContexts(Column_value_listContext.class);
		}
		public Column_value_listContext column_value_list(int i) {
			return getRuleContext(Column_value_listContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(uniformSQLParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(uniformSQLParser.VALUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Value_list_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitValue_list_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_list_clauseContext value_list_clause() throws RecognitionException {
		Value_list_clauseContext _localctx = new Value_list_clauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_value_list_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1021);
			column_value_list();
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1022);
				match(COMMA);
				setState(1023);
				column_value_list();
				}
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_value_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<Bit_exprContext> bit_expr() {
			return getRuleContexts(Bit_exprContext.class);
		}
		public Bit_exprContext bit_expr(int i) {
			return getRuleContext(Bit_exprContext.class,i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(uniformSQLParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(uniformSQLParser.DEFAULT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Column_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_value_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_value_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_value_listContext column_value_list() throws RecognitionException {
		Column_value_listContext _localctx = new Column_value_listContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_column_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			match(LPAREN);
			setState(1032);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1030);
				bit_expr();
				}
				break;
			case 2:
				{
				setState(1031);
				match(DEFAULT);
				}
				break;
			}
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1034);
				match(COMMA);
				setState(1037);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1035);
					bit_expr();
					}
					break;
				case 2:
					{
					setState(1036);
					match(DEFAULT);
					}
					break;
				}
				}
				}
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1044);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_columns_cluaseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public List<Set_column_cluaseContext> set_column_cluase() {
			return getRuleContexts(Set_column_cluaseContext.class);
		}
		public Set_column_cluaseContext set_column_cluase(int i) {
			return getRuleContext(Set_column_cluaseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Set_columns_cluaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_columns_cluase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSet_columns_cluase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_columns_cluaseContext set_columns_cluase() throws RecognitionException {
		Set_columns_cluaseContext _localctx = new Set_columns_cluaseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_set_columns_cluase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(SET);
			setState(1047);
			set_column_cluase();
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1048);
				match(COMMA);
				setState(1049);
				set_column_cluase();
				}
				}
				setState(1054);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_column_cluaseContext extends ParserRuleContext {
		public Column_specContext column_spec() {
			return getRuleContext(Column_specContext.class,0);
		}
		public TerminalNode EQ() { return getToken(uniformSQLParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public Set_column_cluaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_column_cluase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSet_column_cluase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_column_cluaseContext set_column_cluase() throws RecognitionException {
		Set_column_cluaseContext _localctx = new Set_column_cluaseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_set_column_cluase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			column_spec();
			setState(1056);
			match(EQ);
			setState(1059);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1057);
				expression();
				}
				break;
			case 2:
				{
				setState(1058);
				match(DEFAULT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(uniformSQLParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(uniformSQLParser.SCHEMA, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Create_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_database_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_statementContext create_database_statement() throws RecognitionException {
		Create_database_statementContext _localctx = new Create_database_statementContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_create_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(CREATE);
			setState(1062);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1066);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1063);
				match(IF);
				setState(1064);
				match(NOT);
				setState(1065);
				match(EXISTS);
				}
				break;
			}
			setState(1068);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statementContext extends ParserRuleContext {
		public Create_table_statement1Context create_table_statement1() {
			return getRuleContext(Create_table_statement1Context.class,0);
		}
		public Create_table_statement2Context create_table_statement2() {
			return getRuleContext(Create_table_statement2Context.class,0);
		}
		public Create_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statementContext create_table_statement() throws RecognitionException {
		Create_table_statementContext _localctx = new Create_table_statementContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_create_table_statement);
		try {
			setState(1072);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				create_table_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				create_table_statement2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statement1Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Create_definitionContext> create_definition() {
			return getRuleContexts(Create_definitionContext.class);
		}
		public Create_definitionContext create_definition(int i) {
			return getRuleContext(Create_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Create_table_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_table_statement1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statement1Context create_table_statement1() throws RecognitionException {
		Create_table_statement1Context _localctx = new Create_table_statement1Context(_ctx, getState());
		enterRule(_localctx, 222, RULE_create_table_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(CREATE);
			setState(1076);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1075);
				match(TEMPORARY);
				}
			}

			setState(1079);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1078);
				match(EXTERNAL);
				}
			}

			setState(1081);
			match(TABLE);
			setState(1085);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1082);
				match(IF);
				setState(1083);
				match(NOT);
				setState(1084);
				match(EXISTS);
				}
				break;
			}
			setState(1087);
			table_spec();
			setState(1099);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1088);
				match(LPAREN);
				setState(1089);
				create_definition();
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1090);
					match(COMMA);
					setState(1091);
					create_definition();
					}
					}
					setState(1096);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1097);
				match(RPAREN);
				}
			}

			setState(1103);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1101);
				match(COMMENT);
				setState(1102);
				match(TEXT_STRING);
				}
			}

			setState(1107);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1105);
				match(AS);
				setState(1106);
				select_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_statement2Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public List<Table_specContext> table_spec() {
			return getRuleContexts(Table_specContext.class);
		}
		public Table_specContext table_spec(int i) {
			return getRuleContext(Table_specContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Create_table_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_table_statement2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statement2Context create_table_statement2() throws RecognitionException {
		Create_table_statement2Context _localctx = new Create_table_statement2Context(_ctx, getState());
		enterRule(_localctx, 224, RULE_create_table_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(CREATE);
			setState(1111);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1110);
				match(TEMPORARY);
				}
			}

			setState(1114);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1113);
				match(EXTERNAL);
				}
			}

			setState(1116);
			match(TABLE);
			setState(1120);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1117);
				match(IF);
				setState(1118);
				match(NOT);
				setState(1119);
				match(EXISTS);
				}
				break;
			}
			setState(1122);
			table_spec();
			setState(1124);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1123);
				match(LPAREN);
				}
			}

			setState(1126);
			match(LIKE);
			setState(1127);
			table_spec();
			setState(1129);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(1128);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Create_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_definitionContext create_definition() throws RecognitionException {
		Create_definitionContext _localctx = new Create_definitionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_create_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1131);
			column_name();
			setState(1132);
			column_definition();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public Column_data_type_headerContext column_data_type_header() {
			return getRuleContext(Column_data_type_headerContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			column_data_type_header();
			setState(1137);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1135);
				match(COMMENT);
				setState(1136);
				match(TEXT_STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_or_notnullContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public Null_or_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_or_notnull; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitNull_or_notnull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_or_notnullContext null_or_notnull() throws RecognitionException {
		Null_or_notnullContext _localctx = new Null_or_notnullContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_null_or_notnull);
		try {
			setState(1142);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1139);
				match(NOT);
				setState(1140);
				match(NULL);
				}
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_data_type_headerContext extends ParserRuleContext {
		public TerminalNode TINYINT() { return getToken(uniformSQLParser.TINYINT, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Null_or_notnullContext null_or_notnull() {
			return getRuleContext(Null_or_notnullContext.class,0);
		}
		public TerminalNode SMALLINT() { return getToken(uniformSQLParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(uniformSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(uniformSQLParser.BIGINT, 0); }
		public TerminalNode DOUBLE() { return getToken(uniformSQLParser.DOUBLE, 0); }
		public TerminalNode COMMA() { return getToken(uniformSQLParser.COMMA, 0); }
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(uniformSQLParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(uniformSQLParser.TIMESTAMP, 0); }
		public TerminalNode DATETIME() { return getToken(uniformSQLParser.DATETIME, 0); }
		public TerminalNode VARCHAR() { return getToken(uniformSQLParser.VARCHAR, 0); }
		public Varchar_lengthContext varchar_length() {
			return getRuleContext(Varchar_lengthContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(uniformSQLParser.BINARY, 0); }
		public Binary_lengthContext binary_length() {
			return getRuleContext(Binary_lengthContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(uniformSQLParser.BOOLEAN, 0); }
		public Column_data_type_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_data_type_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_data_type_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_data_type_headerContext column_data_type_header() throws RecognitionException {
		Column_data_type_headerContext _localctx = new Column_data_type_headerContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_column_data_type_header);
		int _la;
		try {
			setState(1255);
			switch (_input.LA(1)) {
			case TINYINT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1144);
				match(TINYINT);
				setState(1149);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1145);
					match(LPAREN);
					setState(1146);
					length();
					setState(1147);
					match(RPAREN);
					}
				}

				setState(1152);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1151);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1154);
				match(SMALLINT);
				setState(1159);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1155);
					match(LPAREN);
					setState(1156);
					length();
					setState(1157);
					match(RPAREN);
					}
				}

				setState(1162);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1161);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1164);
				match(INT);
				setState(1169);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1165);
					match(LPAREN);
					setState(1166);
					length();
					setState(1167);
					match(RPAREN);
					}
				}

				setState(1172);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1171);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1174);
				match(BIGINT);
				setState(1179);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1175);
					match(LPAREN);
					setState(1176);
					length();
					setState(1177);
					match(RPAREN);
					}
				}

				setState(1182);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1181);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1184);
				match(DOUBLE);
				setState(1191);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1185);
					match(LPAREN);
					setState(1186);
					length();
					setState(1187);
					match(COMMA);
					setState(1188);
					number_literal();
					setState(1189);
					match(RPAREN);
					}
				}

				setState(1194);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1193);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1196);
				match(FLOAT);
				setState(1203);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1197);
					match(LPAREN);
					setState(1198);
					length();
					setState(1199);
					match(COMMA);
					setState(1200);
					number_literal();
					setState(1201);
					match(RPAREN);
					}
				}

				setState(1206);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1205);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1208);
				match(DECIMAL);
				setState(1217);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1209);
					match(LPAREN);
					setState(1210);
					length();
					setState(1213);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1211);
						match(COMMA);
						setState(1212);
						number_literal();
						}
					}

					setState(1215);
					match(RPAREN);
					}
				}

				setState(1220);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1219);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1222);
				match(DATE);
				setState(1224);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1223);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1226);
				match(TIMESTAMP);
				setState(1228);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1227);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1230);
				match(DATETIME);
				setState(1232);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1231);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(1234);
				match(VARCHAR);
				setState(1235);
				match(LPAREN);
				setState(1236);
				varchar_length();
				setState(1237);
				match(RPAREN);
				setState(1239);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1238);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(1241);
				match(BINARY);
				setState(1246);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1242);
					match(LPAREN);
					setState(1243);
					binary_length();
					setState(1244);
					match(RPAREN);
					}
				}

				setState(1249);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1248);
					null_or_notnull();
					}
				}

				}
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(1251);
				match(BOOLEAN);
				setState(1253);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1252);
					null_or_notnull();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode ASC() { return getToken(uniformSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(uniformSQLParser.DESC, 0); }
		public Index_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_column_nameContext index_column_name() throws RecognitionException {
		Index_column_nameContext _localctx = new Index_column_nameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_index_column_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			column_name();
			setState(1261);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1258);
				match(LPAREN);
				setState(1259);
				match(INTEGER_NUM);
				setState(1260);
				match(RPAREN);
				}
			}

			setState(1264);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1263);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Varchar_lengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public Varchar_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varchar_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitVarchar_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varchar_lengthContext varchar_length() throws RecognitionException {
		Varchar_lengthContext _localctx = new Varchar_lengthContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_varchar_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_lengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUM() { return getToken(uniformSQLParser.INTEGER_NUM, 0); }
		public Binary_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitBinary_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_lengthContext binary_length() throws RecognitionException {
		Binary_lengthContext _localctx = new Binary_lengthContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_binary_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(INTEGER_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_statementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(uniformSQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public List<Alter_table_specificationContext> alter_table_specification() {
			return getRuleContexts(Alter_table_specificationContext.class);
		}
		public Alter_table_specificationContext alter_table_specification(int i) {
			return getRuleContext(Alter_table_specificationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Alter_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitAlter_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_statementContext alter_table_statement() throws RecognitionException {
		Alter_table_statementContext _localctx = new Alter_table_statementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_alter_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			match(ALTER);
			setState(1273);
			match(TABLE);
			setState(1274);
			table_spec();
			setState(1283);
			_la = _input.LA(1);
			if (_la==CHANGE || _la==RENAME) {
				{
				setState(1275);
				alter_table_specification();
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1276);
					match(COMMA);
					setState(1277);
					alter_table_specification();
					}
					}
					setState(1282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_specificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(uniformSQLParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(uniformSQLParser.CHANGE, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode COLUMN() { return getToken(uniformSQLParser.COLUMN, 0); }
		public Alter_table_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitAlter_table_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_specificationContext alter_table_specification() throws RecognitionException {
		Alter_table_specificationContext _localctx = new Alter_table_specificationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_alter_table_specification);
		try {
			setState(1295);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1285);
				match(RENAME);
				setState(1286);
				match(TO);
				setState(1287);
				table_spec();
				}
				}
				break;
			case CHANGE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1288);
				match(CHANGE);
				setState(1290);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1289);
					match(COLUMN);
					}
					break;
				}
				setState(1292);
				column_name();
				setState(1293);
				column_name();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_namesContext extends ParserRuleContext {
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Index_column_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_column_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_column_namesContext index_column_names() throws RecognitionException {
		Index_column_namesContext _localctx = new Index_column_namesContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_index_column_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			index_column_name();
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1298);
				match(COMMA);
				setState(1299);
				index_column_name();
				}
				}
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_typeContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(uniformSQLParser.USING, 0); }
		public TerminalNode HASH() { return getToken(uniformSQLParser.HASH, 0); }
		public Index_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_typeContext index_type() throws RecognitionException {
		Index_typeContext _localctx = new Index_typeContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_index_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			match(USING);
			{
			setState(1306);
			match(HASH);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionContext extends ParserRuleContext {
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public Index_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitIndex_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_optionContext index_option() throws RecognitionException {
		Index_optionContext _localctx = new Index_optionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_index_option);
		try {
			setState(1311);
			switch (_input.LA(1)) {
			case USING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1308);
				index_type();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1309);
				match(COMMENT);
				setState(1310);
				match(TEXT_STRING);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionsContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Column_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitColumn_definitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionsContext column_definitions() throws RecognitionException {
		Column_definitionsContext _localctx = new Column_definitionsContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_column_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			column_name();
			setState(1314);
			column_definition();
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1315);
				match(COMMA);
				setState(1316);
				column_name();
				setState(1317);
				column_definition();
				}
				}
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_table_statementContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(uniformSQLParser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public List<Table_specContext> table_spec() {
			return getRuleContexts(Table_specContext.class);
		}
		public Table_specContext table_spec(int i) {
			return getRuleContext(Table_specContext.class,i);
		}
		public List<TerminalNode> TO() { return getTokens(uniformSQLParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(uniformSQLParser.TO, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Rename_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRename_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rename_table_statementContext rename_table_statement() throws RecognitionException {
		Rename_table_statementContext _localctx = new Rename_table_statementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_rename_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			match(RENAME);
			setState(1325);
			match(TABLE);
			setState(1326);
			table_spec();
			setState(1327);
			match(TO);
			setState(1328);
			table_spec();
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1329);
				match(COMMA);
				setState(1330);
				table_spec();
				setState(1331);
				match(TO);
				setState(1332);
				table_spec();
				}
				}
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_database_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(uniformSQLParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(uniformSQLParser.SCHEMA, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Drop_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDrop_database_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_database_statementContext drop_database_statement() throws RecognitionException {
		Drop_database_statementContext _localctx = new Drop_database_statementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_drop_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			match(DROP);
			setState(1340);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1343);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1341);
				match(IF);
				setState(1342);
				match(EXISTS);
				}
				break;
			}
			setState(1345);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Drop_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDrop_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_statementContext drop_table_statement() throws RecognitionException {
		Drop_table_statementContext _localctx = new Drop_table_statementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_drop_table_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			match(DROP);
			setState(1348);
			match(TABLE);
			setState(1351);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1349);
				match(IF);
				setState(1350);
				match(EXISTS);
				}
				break;
			}
			setState(1353);
			table_spec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Drop_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDrop_view_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_statementContext drop_view_statement() throws RecognitionException {
		Drop_view_statementContext _localctx = new Drop_view_statementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_drop_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			match(DROP);
			setState(1356);
			match(VIEW);
			setState(1359);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1357);
				match(IF);
				setState(1358);
				match(EXISTS);
				}
				break;
			}
			setState(1361);
			table_spec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_user_statementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(uniformSQLParser.DROP, 0); }
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public Drop_user_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_user_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDrop_user_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_user_statementContext drop_user_statement() throws RecognitionException {
		Drop_user_statementContext _localctx = new Drop_user_statementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_drop_user_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(DROP);
			setState(1364);
			match(USER);
			setState(1365);
			user_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public Create_view_bodyContext create_view_body() {
			return getRuleContext(Create_view_bodyContext.class,0);
		}
		public Create_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_view_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_statementContext create_view_statement() throws RecognitionException {
		Create_view_statementContext _localctx = new Create_view_statementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_create_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(CREATE);
			setState(1368);
			create_view_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_bodyContext extends ParserRuleContext {
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public Create_view_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_view_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_bodyContext create_view_body() throws RecognitionException {
		Create_view_bodyContext _localctx = new Create_view_bodyContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_create_view_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			match(VIEW);
			setState(1374);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1371);
				database_name();
				setState(1372);
				match(DOT);
				}
				break;
			}
			setState(1376);
			view_name();
			setState(1380);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1377);
				match(IF);
				setState(1378);
				match(NOT);
				setState(1379);
				match(EXISTS);
				}
			}

			setState(1383);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1382);
				column_list();
				}
			}

			setState(1385);
			match(AS);
			setState(1386);
			select_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_view_statementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(uniformSQLParser.ALTER, 0); }
		public Create_view_bodyContext create_view_body() {
			return getRuleContext(Create_view_bodyContext.class,0);
		}
		public Alter_view_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_view_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitAlter_view_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_view_statementContext alter_view_statement() throws RecognitionException {
		Alter_view_statementContext _localctx = new Alter_view_statementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_alter_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(ALTER);
			setState(1389);
			create_view_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_user_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public TerminalNode IDENTIFIED() { return getToken(uniformSQLParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(uniformSQLParser.BY, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public Create_user_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_user_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_user_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_user_statementContext create_user_statement() throws RecognitionException {
		Create_user_statementContext _localctx = new Create_user_statementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_create_user_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(CREATE);
			setState(1392);
			match(USER);
			setState(1393);
			user_name();
			setState(1394);
			match(IDENTIFIED);
			setState(1395);
			match(BY);
			setState(1396);
			match(TEXT_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_privilege_statementContext extends ParserRuleContext {
		public List<TerminalNode> GRANT() { return getTokens(uniformSQLParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(uniformSQLParser.GRANT, i);
		}
		public List<Priv_typeContext> priv_type() {
			return getRuleContexts(Priv_typeContext.class);
		}
		public Priv_typeContext priv_type(int i) {
			return getRuleContext(Priv_typeContext.class,i);
		}
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public List<Principal_specificationContext> principal_specification() {
			return getRuleContexts(Principal_specificationContext.class);
		}
		public Principal_specificationContext principal_specification(int i) {
			return getRuleContext(Principal_specificationContext.class,i);
		}
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(uniformSQLParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(uniformSQLParser.OPTION, 0); }
		public Grant_privilege_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_privilege_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitGrant_privilege_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_privilege_statementContext grant_privilege_statement() throws RecognitionException {
		Grant_privilege_statementContext _localctx = new Grant_privilege_statementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_grant_privilege_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			match(GRANT);
			setState(1399);
			priv_type();
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1400);
				match(COMMA);
				setState(1401);
				priv_type();
				}
				}
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1407);
			match(ON);
			setState(1410);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1408);
				table_spec();
				}
				break;
			case 2:
				{
				setState(1409);
				view_name();
				}
				break;
			}
			setState(1412);
			match(TO);
			setState(1413);
			principal_specification();
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1414);
				match(COMMA);
				setState(1415);
				principal_specification();
				}
				}
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1424);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1421);
				match(WITH);
				setState(1422);
				match(GRANT);
				setState(1423);
				match(OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Principal_specificationContext extends ParserRuleContext {
		public User_nameContext user_name() {
			return getRuleContext(User_nameContext.class,0);
		}
		public TerminalNode USER() { return getToken(uniformSQLParser.USER, 0); }
		public Principal_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitPrincipal_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Principal_specificationContext principal_specification() throws RecognitionException {
		Principal_specificationContext _localctx = new Principal_specificationContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_principal_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1426);
				match(USER);
				}
				break;
			}
			setState(1429);
			user_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Revoke_privilege_statementContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(uniformSQLParser.REVOKE, 0); }
		public List<Priv_typeContext> priv_type() {
			return getRuleContexts(Priv_typeContext.class);
		}
		public Priv_typeContext priv_type(int i) {
			return getRuleContext(Priv_typeContext.class,i);
		}
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode FROM() { return getToken(uniformSQLParser.FROM, 0); }
		public List<Principal_specificationContext> principal_specification() {
			return getRuleContexts(Principal_specificationContext.class);
		}
		public Principal_specificationContext principal_specification(int i) {
			return getRuleContext(Principal_specificationContext.class,i);
		}
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode GRANT() { return getToken(uniformSQLParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(uniformSQLParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(uniformSQLParser.FOR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public Revoke_privilege_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke_privilege_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitRevoke_privilege_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Revoke_privilege_statementContext revoke_privilege_statement() throws RecognitionException {
		Revoke_privilege_statementContext _localctx = new Revoke_privilege_statementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_revoke_privilege_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			match(REVOKE);
			setState(1435);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(1432);
				match(GRANT);
				setState(1433);
				match(OPTION);
				setState(1434);
				match(FOR);
				}
			}

			setState(1437);
			priv_type();
			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1438);
				match(COMMA);
				setState(1439);
				priv_type();
				}
				}
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1445);
			match(ON);
			setState(1448);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1446);
				table_spec();
				}
				break;
			case 2:
				{
				setState(1447);
				view_name();
				}
				break;
			}
			setState(1450);
			match(FROM);
			setState(1451);
			principal_specification();
			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1452);
				match(COMMA);
				setState(1453);
				principal_specification();
				}
				}
				setState(1458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_event_statementContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(uniformSQLParser.SHOW, 0); }
		public Show_specificationContext show_specification() {
			return getRuleContext(Show_specificationContext.class,0);
		}
		public Show_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitShow_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_event_statementContext show_event_statement() throws RecognitionException {
		Show_event_statementContext _localctx = new Show_event_statementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_show_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(SHOW);
			setState(1460);
			show_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_specificationContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(uniformSQLParser.VIEW, 0); }
		public TerminalNode COLUMNS() { return getToken(uniformSQLParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(uniformSQLParser.FROM, 0); }
		public TerminalNode DATABASES() { return getToken(uniformSQLParser.DATABASES, 0); }
		public TerminalNode SCHEMAS() { return getToken(uniformSQLParser.SCHEMAS, 0); }
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public TerminalNode TABLES() { return getToken(uniformSQLParser.TABLES, 0); }
		public TerminalNode IN() { return getToken(uniformSQLParser.IN, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode GRANT() { return getToken(uniformSQLParser.GRANT, 0); }
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode ALL() { return getToken(uniformSQLParser.ALL, 0); }
		public Principal_nameContext principal_name() {
			return getRuleContext(Principal_nameContext.class,0);
		}
		public Principal_specificationContext principal_specification() {
			return getRuleContext(Principal_specificationContext.class,0);
		}
		public TerminalNode SERVER() { return getToken(uniformSQLParser.SERVER, 0); }
		public TerminalNode ALIASES() { return getToken(uniformSQLParser.ALIASES, 0); }
		public Show_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_specification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitShow_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_specificationContext show_specification() throws RecognitionException {
		Show_specificationContext _localctx = new Show_specificationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_show_specification);
		int _la;
		try {
			setState(1496);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				match(CREATE);
				setState(1463);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1464);
				table_spec();
				}
				break;
			case COLUMNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
				match(COLUMNS);
				setState(1466);
				match(FROM);
				setState(1467);
				table_spec();
				}
				break;
			case DATABASES:
			case SCHEMAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1468);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==SCHEMAS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1471);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(1469);
					match(LIKE);
					setState(1470);
					match(TEXT_STRING);
					}
				}

				}
				break;
			case TABLES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1473);
				match(TABLES);
				setState(1476);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(1474);
					match(IN);
					setState(1475);
					database_name();
					}
				}

				setState(1479);
				_la = _input.LA(1);
				if (_la==TEXT_STRING) {
					{
					setState(1478);
					match(TEXT_STRING);
					}
				}

				}
				break;
			case GRANT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1481);
				match(GRANT);
				setState(1484);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1482);
					principal_name();
					}
					break;
				case 2:
					{
					setState(1483);
					principal_specification();
					}
					break;
				}
				setState(1486);
				match(ON);
				setState(1492);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1487);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1489);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						setState(1488);
						match(TABLE);
						}
						break;
					}
					setState(1491);
					table_spec();
					}
					break;
				}
				}
				break;
			case SERVER:
				enterOuterAlt(_localctx, 6);
				{
				setState(1494);
				match(SERVER);
				setState(1495);
				match(ALIASES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_event_statementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode TO() { return getToken(uniformSQLParser.TO, 0); }
		public Server_alias_nameContext server_alias_name() {
			return getRuleContext(Server_alias_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(uniformSQLParser.DOT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Set_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitSet_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_event_statementContext set_event_statement() throws RecognitionException {
		Set_event_statementContext _localctx = new Set_event_statementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_set_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			match(SET);
			setState(1499);
			match(TABLE);
			setState(1500);
			table_spec();
			setState(1501);
			match(TO);
			setState(1502);
			server_alias_name();
			setState(1503);
			match(DOT);
			setState(1504);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_event_statementContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(uniformSQLParser.USE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Use_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitUse_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_event_statementContext use_event_statement() throws RecognitionException {
		Use_event_statementContext _localctx = new Use_event_statementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_use_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			match(USE);
			setState(1507);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Server_event_statementContext extends ParserRuleContext {
		public TerminalNode SERVER() { return getToken(uniformSQLParser.SERVER, 0); }
		public TerminalNode ALIAS() { return getToken(uniformSQLParser.ALIAS, 0); }
		public Server_alias_nameContext server_alias_name() {
			return getRuleContext(Server_alias_nameContext.class,0);
		}
		public Root_statementContext root_statement() {
			return getRuleContext(Root_statementContext.class,0);
		}
		public Server_event_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_event_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitServer_event_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Server_event_statementContext server_event_statement() throws RecognitionException {
		Server_event_statementContext _localctx = new Server_event_statementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_server_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(SERVER);
			setState(1510);
			match(ALIAS);
			setState(1511);
			server_alias_name();
			setState(1512);
			root_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementsContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Set_columns_cluaseContext set_columns_cluase() {
			return getRuleContext(Set_columns_cluaseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitUpdate_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementsContext update_statements() throws RecognitionException {
		Update_statementsContext _localctx = new Update_statementsContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_update_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			match(UPDATE);
			setState(1515);
			table_spec();
			setState(1516);
			set_columns_cluase();
			setState(1517);
			where_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_statementsContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(uniformSQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(uniformSQLParser.FROM, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Delete_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitDelete_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementsContext delete_statements() throws RecognitionException {
		Delete_statementsContext _localctx = new Delete_statementsContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_delete_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			match(DELETE);
			setState(1520);
			match(FROM);
			setState(1521);
			table_spec();
			setState(1523);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1522);
				where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0155\u05f8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u0138\n\4\3\5\3\5\3\6\3\6\5\6\u013e\n\6\3\6\3\6\5\6"+
		"\u0142\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u014b\n\6\3\6\5\6\u014e\n\6"+
		"\3\6\3\6\5\6\u0152\n\6\3\6\3\6\5\6\u0156\n\6\5\6\u0158\n\6\3\7\3\7\3\b"+
		"\3\b\3\t\5\t\u015f\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u016c\n\f\3\r\3\r\3\r\3\r\5\r\u0172\n\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\5&\u01a5\n&\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\5,\u01b7\n,\3-\3-\3.\3"+
		".\3.\7.\u01be\n.\f.\16.\u01c1\13.\3/\3/\3/\7/\u01c6\n/\f/\16/\u01c9\13"+
		"/\3\60\3\60\3\60\7\60\u01ce\n\60\f\60\16\60\u01d1\13\60\3\61\5\61\u01d4"+
		"\n\61\3\61\3\61\3\62\3\62\3\62\5\62\u01db\n\62\3\62\3\62\5\62\u01df\n"+
		"\62\5\62\u01e1\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01ea\n\63"+
		"\3\63\3\63\3\63\5\63\u01ef\n\63\3\63\3\63\3\63\5\63\u01f4\n\63\3\64\3"+
		"\64\5\64\u01f8\n\64\3\64\3\64\3\64\5\64\u01fd\n\64\3\64\3\64\5\64\u0201"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u020a\n\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u0211\n\64\3\64\3\64\3\64\3\64\5\64\u0217\n\64\3\65\3"+
		"\65\3\65\5\65\u021c\n\65\3\66\3\66\3\66\5\66\u0221\n\66\3\67\3\67\3\67"+
		"\5\67\u0226\n\67\38\38\38\78\u022b\n8\f8\168\u022e\138\39\39\39\79\u0233"+
		"\n9\f9\169\u0236\139\3:\3:\3:\5:\u023b\n:\3;\3;\3;\5;\u0240\n;\3<\3<\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u024d\n=\3>\3>\3>\3>\3>\7>\u0254\n>\f>\16"+
		">\u0257\13>\5>\u0259\n>\3>\5>\u025c\n>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5"+
		">\u0268\n>\3>\3>\5>\u026c\n>\3>\3>\5>\u0270\n>\3?\3?\5?\u0274\n?\3@\3"+
		"@\3@\3@\3@\3@\6@\u027c\n@\r@\16@\u027d\3@\3@\5@\u0282\n@\3@\3@\5@\u0286"+
		"\n@\3A\3A\3A\3A\3A\3A\3A\6A\u028f\nA\rA\16A\u0290\3A\3A\5A\u0295\nA\3"+
		"A\3A\3B\3B\3B\5B\u029c\nB\3B\3B\3C\3C\3C\6C\u02a3\nC\rC\16C\u02a4\3C\3"+
		"C\3C\6C\u02aa\nC\rC\16C\u02ab\5C\u02ae\nC\3D\3D\3D\3D\7D\u02b4\nD\fD\16"+
		"D\u02b7\13D\3D\3D\3E\3E\3E\3E\3F\3F\3F\7F\u02c2\nF\fF\16F\u02c5\13F\3"+
		"G\3G\5G\u02c9\nG\3H\3H\5H\u02cd\nH\3H\3H\3H\5H\u02d2\nH\7H\u02d4\nH\f"+
		"H\16H\u02d7\13H\3I\3I\3I\5I\u02dc\nI\3I\3I\3I\3I\7I\u02e2\nI\fI\16I\u02e5"+
		"\13I\3J\3J\3J\5J\u02ea\nJ\5J\u02ec\nJ\3J\3J\5J\u02f0\nJ\3K\3K\5K\u02f4"+
		"\nK\3K\3K\5K\u02f8\nK\3K\3K\3K\3K\3K\5K\u02ff\nK\3L\3L\3L\3M\3M\3M\7M"+
		"\u0307\nM\fM\16M\u030a\13M\3N\3N\3N\3N\3N\3N\3N\5N\u0313\nN\5N\u0315\n"+
		"N\3O\3O\3O\3O\5O\u031b\nO\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0325\nO\3P\3P\3"+
		"P\7P\u032a\nP\fP\16P\u032d\13P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\7R\u0337\nR\fR"+
		"\16R\u033a\13R\3S\3S\5S\u033e\nS\3S\5S\u0341\nS\3T\3T\3T\3T\3T\5T\u0348"+
		"\nT\3U\3U\3U\3U\3U\3U\5U\u0350\nU\3V\3V\3V\3V\5V\u0356\nV\3W\3W\3W\3W"+
		"\5W\u035c\nW\3X\3X\3X\3X\5X\u0362\nX\3Y\5Y\u0365\nY\3Y\3Y\5Y\u0369\nY"+
		"\3Y\3Y\5Y\u036d\nY\3Y\5Y\u0370\nY\3Y\3Y\5Y\u0374\nY\7Y\u0376\nY\fY\16"+
		"Y\u0379\13Y\3Z\3Z\5Z\u037d\nZ\3Z\3Z\3Z\3Z\5Z\u0383\nZ\3Z\5Z\u0386\nZ\3"+
		"Z\5Z\u0389\nZ\5Z\u038b\nZ\3Z\5Z\u038e\nZ\3Z\5Z\u0391\nZ\3[\3[\3[\3\\\3"+
		"\\\3\\\3\\\3\\\7\\\u039b\n\\\f\\\16\\\u039e\13\\\3]\3]\3]\5]\u03a3\n]"+
		"\3^\3^\3^\3_\3_\3_\3_\3_\7_\u03ad\n_\f_\16_\u03b0\13_\3`\3`\5`\u03b4\n"+
		"`\3a\3a\3a\3a\5a\u03ba\na\3a\3a\3b\3b\3c\3c\3d\3d\3d\7d\u03c5\nd\fd\16"+
		"d\u03c8\13d\3e\3e\3e\3e\7e\u03ce\ne\fe\16e\u03d1\13e\3e\3e\3f\3f\3f\3"+
		"f\3g\3g\3g\5g\u03dc\ng\3g\3g\3h\3h\3h\3h\3h\3h\3h\5h\u03e7\nh\3h\3h\5"+
		"h\u03eb\nh\5h\u03ed\nh\3i\3i\5i\u03f1\ni\3i\3i\5i\u03f5\ni\3j\3j\5j\u03f9"+
		"\nj\3j\3j\5j\u03fd\nj\3k\3k\3k\3k\7k\u0403\nk\fk\16k\u0406\13k\3l\3l\3"+
		"l\5l\u040b\nl\3l\3l\3l\5l\u0410\nl\7l\u0412\nl\fl\16l\u0415\13l\3l\3l"+
		"\3m\3m\3m\3m\7m\u041d\nm\fm\16m\u0420\13m\3n\3n\3n\3n\5n\u0426\nn\3o\3"+
		"o\3o\3o\3o\5o\u042d\no\3o\3o\3p\3p\5p\u0433\np\3q\3q\5q\u0437\nq\3q\5"+
		"q\u043a\nq\3q\3q\3q\3q\5q\u0440\nq\3q\3q\3q\3q\3q\7q\u0447\nq\fq\16q\u044a"+
		"\13q\3q\3q\5q\u044e\nq\3q\3q\5q\u0452\nq\3q\3q\5q\u0456\nq\3r\3r\5r\u045a"+
		"\nr\3r\5r\u045d\nr\3r\3r\3r\3r\5r\u0463\nr\3r\3r\5r\u0467\nr\3r\3r\3r"+
		"\5r\u046c\nr\3s\3s\3s\3t\3t\3t\5t\u0474\nt\3u\3u\3u\5u\u0479\nu\3v\3v"+
		"\3v\3v\3v\5v\u0480\nv\3v\5v\u0483\nv\3v\3v\3v\3v\3v\5v\u048a\nv\3v\5v"+
		"\u048d\nv\3v\3v\3v\3v\3v\5v\u0494\nv\3v\5v\u0497\nv\3v\3v\3v\3v\3v\5v"+
		"\u049e\nv\3v\5v\u04a1\nv\3v\3v\3v\3v\3v\3v\3v\5v\u04aa\nv\3v\5v\u04ad"+
		"\nv\3v\3v\3v\3v\3v\3v\3v\5v\u04b6\nv\3v\5v\u04b9\nv\3v\3v\3v\3v\3v\5v"+
		"\u04c0\nv\3v\3v\5v\u04c4\nv\3v\5v\u04c7\nv\3v\3v\5v\u04cb\nv\3v\3v\5v"+
		"\u04cf\nv\3v\3v\5v\u04d3\nv\3v\3v\3v\3v\3v\5v\u04da\nv\3v\3v\3v\3v\3v"+
		"\5v\u04e1\nv\3v\5v\u04e4\nv\3v\3v\5v\u04e8\nv\5v\u04ea\nv\3w\3w\3w\3w"+
		"\5w\u04f0\nw\3w\5w\u04f3\nw\3x\3x\3y\3y\3z\3z\3{\3{\3{\3{\3{\3{\7{\u0501"+
		"\n{\f{\16{\u0504\13{\5{\u0506\n{\3|\3|\3|\3|\3|\5|\u050d\n|\3|\3|\3|\5"+
		"|\u0512\n|\3}\3}\3}\7}\u0517\n}\f}\16}\u051a\13}\3~\3~\3~\3\177\3\177"+
		"\3\177\5\177\u0522\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\7\u0080\u052a\n\u0080\f\u0080\16\u0080\u052d\13\u0080\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081"+
		"\u0539\n\u0081\f\u0081\16\u0081\u053c\13\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\5\u0082\u0542\n\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u054a\n\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\5\u0084\u0552\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087"+
		"\u0561\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0567\n\u0087\3"+
		"\u0087\5\u0087\u056a\n\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3"+
		"\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\7\u008a\u057d\n\u008a\f\u008a\16\u008a\u0580"+
		"\13\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0585\n\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\7\u008a\u058b\n\u008a\f\u008a\16\u008a\u058e\13\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u0593\n\u008a\3\u008b\5\u008b\u0596\n"+
		"\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u059e\n"+
		"\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u05a3\n\u008c\f\u008c\16\u008c"+
		"\u05a6\13\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u05ab\n\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\7\u008c\u05b1\n\u008c\f\u008c\16\u008c\u05b4"+
		"\13\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u05c2\n\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u05c7\n\u008e\3\u008e\5\u008e\u05ca\n\u008e\3\u008e\3"+
		"\u008e\3\u008e\5\u008e\u05cf\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u05d4"+
		"\n\u008e\3\u008e\5\u008e\u05d7\n\u008e\3\u008e\3\u008e\5\u008e\u05db\n"+
		"\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093"+
		"\u05f6\n\u0093\3\u0093\2\2\u0094\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\2\32\3\2\3\u0137"+
		"\4\2\u0131\u0134\u0147\u0148\4\2\u0108\u010c\u010e\u010e\3\2\u0141\u0142"+
		"\4\2\u014a\u014a\u014e\u014e\3\2\3\4\3\2\u00ed\u00fc\6\2\u00fd\u0105\u0122"+
		"\u0122\u0126\u0127\u0129\u012a\4\2\u0107\u0110\u0123\u0123\4\2\u0117\u0117"+
		"\u0128\u0128\3\2\u0112\u0116\7\2\5\5\24\24\26\26\u00a4\u00a4\u00d2\u00d2"+
		"\3\2\u0136\u0137\5\2\u012b\u012c\u013c\u013c\u0146\u0146\4\2\u00c2\u00c2"+
		"\u0141\u0143\4\2\5\5\25\25\4\2\u00c3\u00c3\u00e9\u00e9\3\2\34\36\4\2%"+
		"%jj\3\2\13\f\3\2\u011c\u011d\4\2\u00a9\u00a9\u00ac\u00ac\4\2\"\"\u00a7"+
		"\u00a7\4\2\u00aa\u00aa\u00ad\u00ad\u0666\2\u0126\3\2\2\2\4\u0128\3\2\2"+
		"\2\6\u0137\3\2\2\2\b\u0139\3\2\2\2\n\u0157\3\2\2\2\f\u0159\3\2\2\2\16"+
		"\u015b\3\2\2\2\20\u015e\3\2\2\2\22\u0162\3\2\2\2\24\u0164\3\2\2\2\26\u016b"+
		"\3\2\2\2\30\u0171\3\2\2\2\32\u0173\3\2\2\2\34\u0175\3\2\2\2\36\u0177\3"+
		"\2\2\2 \u0179\3\2\2\2\"\u017b\3\2\2\2$\u017d\3\2\2\2&\u017f\3\2\2\2(\u0181"+
		"\3\2\2\2*\u0183\3\2\2\2,\u0185\3\2\2\2.\u0187\3\2\2\2\60\u0189\3\2\2\2"+
		"\62\u018b\3\2\2\2\64\u018d\3\2\2\2\66\u018f\3\2\2\28\u0191\3\2\2\2:\u0193"+
		"\3\2\2\2<\u0195\3\2\2\2>\u0197\3\2\2\2@\u0199\3\2\2\2B\u019b\3\2\2\2D"+
		"\u019d\3\2\2\2F\u019f\3\2\2\2H\u01a1\3\2\2\2J\u01a4\3\2\2\2L\u01a8\3\2"+
		"\2\2N\u01aa\3\2\2\2P\u01ac\3\2\2\2R\u01ae\3\2\2\2T\u01b0\3\2\2\2V\u01b6"+
		"\3\2\2\2X\u01b8\3\2\2\2Z\u01ba\3\2\2\2\\\u01c2\3\2\2\2^\u01ca\3\2\2\2"+
		"`\u01d3\3\2\2\2b\u01d7\3\2\2\2d\u01f3\3\2\2\2f\u0216\3\2\2\2h\u0218\3"+
		"\2\2\2j\u021d\3\2\2\2l\u0222\3\2\2\2n\u0227\3\2\2\2p\u022f\3\2\2\2r\u0237"+
		"\3\2\2\2t\u023f\3\2\2\2v\u0241\3\2\2\2x\u024c\3\2\2\2z\u026f\3\2\2\2|"+
		"\u0273\3\2\2\2~\u0275\3\2\2\2\u0080\u0287\3\2\2\2\u0082\u029b\3\2\2\2"+
		"\u0084\u02ad\3\2\2\2\u0086\u02af\3\2\2\2\u0088\u02ba\3\2\2\2\u008a\u02be"+
		"\3\2\2\2\u008c\u02c8\3\2\2\2\u008e\u02ca\3\2\2\2\u0090\u02d8\3\2\2\2\u0092"+
		"\u02e6\3\2\2\2\u0094\u02fe\3\2\2\2\u0096\u0300\3\2\2\2\u0098\u0303\3\2"+
		"\2\2\u009a\u030b\3\2\2\2\u009c\u0324\3\2\2\2\u009e\u0326\3\2\2\2\u00a0"+
		"\u032e\3\2\2\2\u00a2\u0333\3\2\2\2\u00a4\u033d\3\2\2\2\u00a6\u0347\3\2"+
		"\2\2\u00a8\u034f\3\2\2\2\u00aa\u0355\3\2\2\2\u00ac\u035b\3\2\2\2\u00ae"+
		"\u0361\3\2\2\2\u00b0\u0364\3\2\2\2\u00b2\u037a\3\2\2\2\u00b4\u0392\3\2"+
		"\2\2\u00b6\u0395\3\2\2\2\u00b8\u03a2\3\2\2\2\u00ba\u03a4\3\2\2\2\u00bc"+
		"\u03a7\3\2\2\2\u00be\u03b1\3\2\2\2\u00c0\u03b5\3\2\2\2\u00c2\u03bd\3\2"+
		"\2\2\u00c4\u03bf\3\2\2\2\u00c6\u03c1\3\2\2\2\u00c8\u03c9\3\2\2\2\u00ca"+
		"\u03d4\3\2\2\2\u00cc\u03db\3\2\2\2\u00ce\u03ec\3\2\2\2\u00d0\u03ee\3\2"+
		"\2\2\u00d2\u03f6\3\2\2\2\u00d4\u03fe\3\2\2\2\u00d6\u0407\3\2\2\2\u00d8"+
		"\u0418\3\2\2\2\u00da\u0421\3\2\2\2\u00dc\u0427\3\2\2\2\u00de\u0432\3\2"+
		"\2\2\u00e0\u0434\3\2\2\2\u00e2\u0457\3\2\2\2\u00e4\u046d\3\2\2\2\u00e6"+
		"\u0470\3\2\2\2\u00e8\u0478\3\2\2\2\u00ea\u04e9\3\2\2\2\u00ec\u04eb\3\2"+
		"\2\2\u00ee\u04f4\3\2\2\2\u00f0\u04f6\3\2\2\2\u00f2\u04f8\3\2\2\2\u00f4"+
		"\u04fa\3\2\2\2\u00f6\u0511\3\2\2\2\u00f8\u0513\3\2\2\2\u00fa\u051b\3\2"+
		"\2\2\u00fc\u0521\3\2\2\2\u00fe\u0523\3\2\2\2\u0100\u052e\3\2\2\2\u0102"+
		"\u053d\3\2\2\2\u0104\u0545\3\2\2\2\u0106\u054d\3\2\2\2\u0108\u0555\3\2"+
		"\2\2\u010a\u0559\3\2\2\2\u010c\u055c\3\2\2\2\u010e\u056e\3\2\2\2\u0110"+
		"\u0571\3\2\2\2\u0112\u0578\3\2\2\2\u0114\u0595\3\2\2\2\u0116\u0599\3\2"+
		"\2\2\u0118\u05b5\3\2\2\2\u011a\u05da\3\2\2\2\u011c\u05dc\3\2\2\2\u011e"+
		"\u05e4\3\2\2\2\u0120\u05e7\3\2\2\2\u0122\u05ec\3\2\2\2\u0124\u05f1\3\2"+
		"\2\2\u0126\u0127\t\2\2\2\u0127\3\3\2\2\2\u0128\u0129\7\u0155\2\2\u0129"+
		"\5\3\2\2\2\u012a\u0138\3\2\2\2\u012b\u0138\7J\2\2\u012c\u0138\7K\2\2\u012d"+
		"\u0138\7L\2\2\u012e\u0138\7M\2\2\u012f\u0138\7I\2\2\u0130\u0138\7N\2\2"+
		"\u0131\u0138\7O\2\2\u0132\u0138\7P\2\2\u0133\u0138\7R\2\2\u0134\u0138"+
		"\7U\2\2\u0135\u0138\7\u00c2\2\2\u0136\u0138\7S\2\2\u0137\u012a\3\2\2\2"+
		"\u0137\u012b\3\2\2\2\u0137\u012c\3\2\2\2\u0137\u012d\3\2\2\2\u0137\u012e"+
		"\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0130\3\2\2\2\u0137\u0131\3\2\2\2\u0137"+
		"\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0136\3\2\2\2\u0138\7\3\2\2\2\u0139\u013a\t\3\2\2\u013a\t\3"+
		"\2\2\2\u013b\u013d\7\u00c2\2\2\u013c\u013e\7\u014a\2\2\u013d\u013c\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0158\3\2\2\2\u013f\u0141\7\u00ec\2\2\u0140"+
		"\u0142\7\u014a\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0158"+
		"\3\2\2\2\u0143\u0158\7P\2\2\u0144\u0158\7Q\2\2\u0145\u014d\7S\2\2\u0146"+
		"\u0147\7\u013e\2\2\u0147\u014a\7\u014a\2\2\u0148\u0149\7\u013b\2\2\u0149"+
		"\u014b\7\u014a\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014e\7\u013d\2\2\u014d\u0146\3\2\2\2\u014d\u014e\3\2\2"+
		"\2\u014e\u0158\3\2\2\2\u014f\u0151\7\u0124\2\2\u0150\u0152\7\u0125\2\2"+
		"\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0158\3\2\2\2\u0153\u0155"+
		"\7\u00b8\2\2\u0154\u0156\7\u0125\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3"+
		"\2\2\2\u0156\u0158\3\2\2\2\u0157\u013b\3\2\2\2\u0157\u013f\3\2\2\2\u0157"+
		"\u0143\3\2\2\2\u0157\u0144\3\2\2\2\u0157\u0145\3\2\2\2\u0157\u014f\3\2"+
		"\2\2\u0157\u0153\3\2\2\2\u0158\13\3\2\2\2\u0159\u015a\t\4\2\2\u015a\r"+
		"\3\2\2\2\u015b\u015c\7\u014f\2\2\u015c\17\3\2\2\2\u015d\u015f\t\5\2\2"+
		"\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161"+
		"\t\6\2\2\u0161\21\3\2\2\2\u0162\u0163\7\u014d\2\2\u0163\23\3\2\2\2\u0164"+
		"\u0165\t\7\2\2\u0165\25\3\2\2\2\u0166\u016c\5\16\b\2\u0167\u016c\5\20"+
		"\t\2\u0168\u016c\5\22\n\2\u0169\u016c\5\24\13\2\u016a\u016c\7:\2\2\u016b"+
		"\u0166\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016a\3\2\2\2\u016c\27\3\2\2\2\u016d\u0172\5\32\16\2\u016e"+
		"\u0172\5\34\17\2\u016f\u0172\5\36\20\2\u0170\u0172\5 \21\2\u0171\u016d"+
		"\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172"+
		"\31\3\2\2\2\u0173\u0174\t\b\2\2\u0174\33\3\2\2\2\u0175\u0176\t\t\2\2\u0176"+
		"\35\3\2\2\2\u0177\u0178\t\n\2\2\u0178\37\3\2\2\2\u0179\u017a\t\13\2\2"+
		"\u017a!\3\2\2\2\u017b\u017c\t\f\2\2\u017c#\3\2\2\2\u017d\u017e\5V,\2\u017e"+
		"%\3\2\2\2\u017f\u0180\5V,\2\u0180\'\3\2\2\2\u0181\u0182\5V,\2\u0182)\3"+
		"\2\2\2\u0183\u0184\5V,\2\u0184+\3\2\2\2\u0185\u0186\5V,\2\u0186-\3\2\2"+
		"\2\u0187\u0188\5V,\2\u0188/\3\2\2\2\u0189\u018a\5V,\2\u018a\61\3\2\2\2"+
		"\u018b\u018c\5V,\2\u018c\63\3\2\2\2\u018d\u018e\5V,\2\u018e\65\3\2\2\2"+
		"\u018f\u0190\5V,\2\u0190\67\3\2\2\2\u0191\u0192\5V,\2\u01929\3\2\2\2\u0193"+
		"\u0194\5V,\2\u0194;\3\2\2\2\u0195\u0196\5V,\2\u0196=\3\2\2\2\u0197\u0198"+
		"\5V,\2\u0198?\3\2\2\2\u0199\u019a\5V,\2\u019aA\3\2\2\2\u019b\u019c\5V"+
		",\2\u019cC\3\2\2\2\u019d\u019e\5V,\2\u019eE\3\2\2\2\u019f\u01a0\5V,\2"+
		"\u01a0G\3\2\2\2\u01a1\u01a2\5V,\2\u01a2I\3\2\2\2\u01a3\u01a5\7\23\2\2"+
		"\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7"+
		"\5V,\2\u01a7K\3\2\2\2\u01a8\u01a9\5V,\2\u01a9M\3\2\2\2\u01aa\u01ab\5V"+
		",\2\u01abO\3\2\2\2\u01ac\u01ad\5V,\2\u01adQ\3\2\2\2\u01ae\u01af\5V,\2"+
		"\u01afS\3\2\2\2\u01b0\u01b1\5V,\2\u01b1U\3\2\2\2\u01b2\u01b7\7\u0150\2"+
		"\2\u01b3\u01b7\5\2\2\2\u01b4\u01b7\5\16\b\2\u01b5\u01b7\5z>\2\u01b6\u01b2"+
		"\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"W\3\2\2\2\u01b8\u01b9\t\r\2\2\u01b9Y\3\2\2\2\u01ba\u01bf\5\\/\2\u01bb"+
		"\u01bc\7\u012d\2\2\u01bc\u01be\5\\/\2\u01bd\u01bb\3\2\2\2\u01be\u01c1"+
		"\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0[\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c2\u01c7\5^\60\2\u01c3\u01c4\7\u012f\2\2\u01c4\u01c6"+
		"\5^\60\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8]\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cf\5`\61\2"+
		"\u01cb\u01cc\7\u012e\2\2\u01cc\u01ce\5`\61\2\u01cd\u01cb\3\2\2\2\u01ce"+
		"\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0_\3\2\2\2"+
		"\u01d1\u01cf\3\2\2\2\u01d2\u01d4\7\6\2\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\5b\62\2\u01d6a\3\2\2\2\u01d7"+
		"\u01e0\5d\63\2\u01d8\u01da\79\2\2\u01d9\u01db\7\6\2\2\u01da\u01d9\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01df\5\24\13\2\u01dd"+
		"\u01df\7:\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e1\3\2"+
		"\2\2\u01e0\u01d8\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1c\3\2\2\2\u01e2\u01e3"+
		"\5f\64\2\u01e3\u01e4\5\b\5\2\u01e4\u01e5\5f\64\2\u01e5\u01f4\3\2\2\2\u01e6"+
		"\u01e7\5f\64\2\u01e7\u01e9\5\b\5\2\u01e8\u01ea\7\5\2\2\u01e9\u01e8\3\2"+
		"\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\5\u00caf\2\u01ec"+
		"\u01f4\3\2\2\2\u01ed\u01ef\7\6\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\7\n\2\2\u01f1\u01f4\5\u00caf\2\u01f2"+
		"\u01f4\5f\64\2\u01f3\u01e2\3\2\2\2\u01f3\u01e6\3\2\2\2\u01f3\u01ee\3\2"+
		"\2\2\u01f3\u01f2\3\2\2\2\u01f4e\3\2\2\2\u01f5\u01f7\5h\65\2\u01f6\u01f8"+
		"\7\6\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fc\7\u00a8\2\2\u01fa\u01fd\5\u00caf\2\u01fb\u01fd\5\u0086D\2\u01fc"+
		"\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\u0217\3\2\2\2\u01fe\u0200\5h"+
		"\65\2\u01ff\u0201\7\6\2\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0203\7\u00c0\2\2\u0203\u0204\5h\65\2\u0204\u0205"+
		"\7\u012e\2\2\u0205\u0206\5f\64\2\u0206\u0217\3\2\2\2\u0207\u0209\5h\65"+
		"\2\u0208\u020a\7\6\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b"+
		"\3\2\2\2\u020b\u020c\7\7\2\2\u020c\u020d\5x=\2\u020d\u0217\3\2\2\2\u020e"+
		"\u0210\5h\65\2\u020f\u0211\7\6\2\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\u0213\7\u0085\2\2\u0213\u0214\5h\65\2\u0214"+
		"\u0217\3\2\2\2\u0215\u0217\5h\65\2\u0216\u01f5\3\2\2\2\u0216\u01fe\3\2"+
		"\2\2\u0216\u0207\3\2\2\2\u0216\u020e\3\2\2\2\u0216\u0215\3\2\2\2\u0217"+
		"g\3\2\2\2\u0218\u021b\5j\66\2\u0219\u021a\7\u0144\2\2\u021a\u021c\5j\66"+
		"\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021ci\3\2\2\2\u021d\u0220"+
		"\5l\67\2\u021e\u021f\7\u0145\2\2\u021f\u0221\5l\67\2\u0220\u021e\3\2\2"+
		"\2\u0220\u0221\3\2\2\2\u0221k\3\2\2\2\u0222\u0225\5n8\2\u0223\u0224\t"+
		"\16\2\2\u0224\u0226\5n8\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"m\3\2\2\2\u0227\u022c\5p9\2\u0228\u0229\t\5\2\2\u0229\u022b\5p9\2\u022a"+
		"\u0228\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022do\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0234\5r:\2\u0230\u0231"+
		"\t\17\2\2\u0231\u0233\5r:\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235q\3\2\2\2\u0236\u0234\3\2\2\2"+
		"\u0237\u023a\5t;\2\u0238\u0239\t\5\2\2\u0239\u023b\5\u0088E\2\u023a\u0238"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023bs\3\2\2\2\u023c\u023d\t\20\2\2\u023d"+
		"\u0240\5x=\2\u023e\u0240\5x=\2\u023f\u023c\3\2\2\2\u023f\u023e\3\2\2\2"+
		"\u0240u\3\2\2\2\u0241\u0242\5x=\2\u0242w\3\2\2\2\u0243\u024d\5\26\f\2"+
		"\u0244\u024d\5\u0082B\2\u0245\u024d\5z>\2\u0246\u024d\5\u0086D\2\u0247"+
		"\u024d\5\u0084C\2\u0248\u024d\5\u00caf\2\u0249\u024a\7\n\2\2\u024a\u024d"+
		"\5\u00caf\2\u024b\u024d\5|?\2\u024c\u0243\3\2\2\2\u024c\u0244\3\2\2\2"+
		"\u024c\u0245\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u0247\3\2\2\2\u024c\u0248"+
		"\3\2\2\2\u024c\u0249\3\2\2\2\u024c\u024b\3\2\2\2\u024dy\3\2\2\2\u024e"+
		"\u025b\5\30\r\2\u024f\u0258\7\u013e\2\2\u0250\u0255\5Z.\2\u0251\u0252"+
		"\7\u013b\2\2\u0252\u0254\5Z.\2\u0253\u0251\3\2\2\2\u0254\u0257\3\2\2\2"+
		"\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255"+
		"\3\2\2\2\u0258\u0250\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\7\u013d\2\2\u025b\u024f\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u0270"+
		"\3\2\2\2\u025d\u025e\7\u0081\2\2\u025e\u025f\7\u013e\2\2\u025f\u0260\5"+
		"Z.\2\u0260\u0261\7\23\2\2\u0261\u0262\5\n\6\2\u0262\u0263\7\u013d\2\2"+
		"\u0263\u0270\3\2\2\2\u0264\u0265\5\"\22\2\u0265\u0267\7\u013e\2\2\u0266"+
		"\u0268\t\21\2\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026b\3"+
		"\2\2\2\u0269\u026c\7\u013c\2\2\u026a\u026c\5h\65\2\u026b\u0269\3\2\2\2"+
		"\u026b\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\7\u013d\2\2\u026e"+
		"\u0270\3\2\2\2\u026f\u024e\3\2\2\2\u026f\u025d\3\2\2\2\u026f\u0264\3\2"+
		"\2\2\u0270{\3\2\2\2\u0271\u0274\5~@\2\u0272\u0274\5\u0080A\2\u0273\u0271"+
		"\3\2\2\2\u0273\u0272\3\2\2\2\u0274}\3\2\2\2\u0275\u027b\7\u009a\2\2\u0276"+
		"\u0277\7\u009b\2\2\u0277\u0278\5Z.\2\u0278\u0279\7\u009c\2\2\u0279\u027a"+
		"\5h\65\2\u027a\u027c\3\2\2\2\u027b\u0276\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u0280\7\u009d"+
		"\2\2\u0280\u0282\5h\65\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0285\7\u009e\2\2\u0284\u0286\5J&\2\u0285\u0284\3"+
		"\2\2\2\u0285\u0286\3\2\2\2\u0286\177\3\2\2\2\u0287\u0288\7\u009a\2\2\u0288"+
		"\u028e\5h\65\2\u0289\u028a\7\u009b\2\2\u028a\u028b\5h\65\2\u028b\u028c"+
		"\7\u009c\2\2\u028c\u028d\5h\65\2\u028d\u028f\3\2\2\2\u028e\u0289\3\2\2"+
		"\2\u028f\u0290\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0294"+
		"\3\2\2\2\u0292\u0293\7\u009d\2\2\u0293\u0295\5h\65\2\u0294\u0292\3\2\2"+
		"\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\7\u009e\2\2\u0297"+
		"\u0081\3\2\2\2\u0298\u0299\5\u00ccg\2\u0299\u029a\7\u013a\2\2\u029a\u029c"+
		"\3\2\2\2\u029b\u0298\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u029e\5,\27\2\u029e\u0083\3\2\2\2\u029f\u02a2\5,\27\2\u02a0\u02a1\7\u012d"+
		"\2\2\u02a1\u02a3\5\u0082B\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02ae\3\2\2\2\u02a6\u02a9\5,"+
		"\27\2\u02a7\u02a8\7\u012e\2\2\u02a8\u02aa\5,\27\2\u02a9\u02a7\3\2\2\2"+
		"\u02aa\u02ab\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae"+
		"\3\2\2\2\u02ad\u029f\3\2\2\2\u02ad\u02a6\3\2\2\2\u02ae\u0085\3\2\2\2\u02af"+
		"\u02b0\7\u013e\2\2\u02b0\u02b5\5Z.\2\u02b1\u02b2\7\u013b\2\2\u02b2\u02b4"+
		"\5Z.\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9\7\u013d"+
		"\2\2\u02b9\u0087\3\2\2\2\u02ba\u02bb\7\u0106\2\2\u02bb\u02bc\5Z.\2\u02bc"+
		"\u02bd\5\f\7\2\u02bd\u0089\3\2\2\2\u02be\u02c3\5\u008cG\2\u02bf\u02c0"+
		"\7\u013b\2\2\u02c0\u02c2\5\u008cG\2\u02c1\u02bf\3\2\2\2\u02c2\u02c5\3"+
		"\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u008b\3\2\2\2\u02c5"+
		"\u02c3\3\2\2\2\u02c6\u02c9\5\u008eH\2\u02c7\u02c9\5\u0094K\2\u02c8\u02c6"+
		"\3\2\2\2\u02c8\u02c7\3\2\2\2\u02c9\u008d\3\2\2\2\u02ca\u02d5\5\u0090I"+
		"\2\u02cb\u02cd\t\22\2\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02ce\u02cf\7\33\2\2\u02cf\u02d1\5\u0094K\2\u02d0\u02d2"+
		"\5\u0096L\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2"+
		"\2\u02d3\u02cc\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6"+
		"\3\2\2\2\u02d6\u008f\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02e3\5\u0092J"+
		"\2\u02d9\u02db\t\23\2\2\u02da\u02dc\7\30\2\2\u02db\u02da\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\7\33\2\2\u02de\u02df\5"+
		"\u0092J\2\u02df\u02e0\5\u0096L\2\u02e0\u02e2\3\2\2\2\u02e1\u02d9\3\2\2"+
		"\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u0091"+
		"\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02ef\5\u0094K\2\u02e7\u02e9\t\23\2"+
		"\2\u02e8\u02ea\7\30\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02e7\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u02ee\7\33\2\2\u02ee\u02f0\5\u0094K\2\u02ef\u02eb\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u0093\3\2\2\2\u02f1\u02f3\5\u00ccg\2\u02f2\u02f4"+
		"\5J&\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02ff\3\2\2\2\u02f5"+
		"\u02f7\5\u00caf\2\u02f6\u02f8\5J&\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3"+
		"\2\2\2\u02f8\u02ff\3\2\2\2\u02f9\u02fa\7\u013e\2\2\u02fa\u02fb\5\u008a"+
		"F\2\u02fb\u02fc\7\u013d\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02ff\7\u0150\2"+
		"\2\u02fe\u02f1\3\2\2\2\u02fe\u02f5\3\2\2\2\u02fe\u02f9\3\2\2\2\u02fe\u02fd"+
		"\3\2\2\2\u02ff\u0095\3\2\2\2\u0300\u0301\7\37\2\2\u0301\u0302\5Z.\2\u0302"+
		"\u0097\3\2\2\2\u0303\u0308\5\u009cO\2\u0304\u0305\7\u013b\2\2\u0305\u0307"+
		"\5\u009cO\2\u0306\u0304\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2"+
		"\2\u0308\u0309\3\2\2\2\u0309\u0099\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u0314"+
		"\t\24\2\2\u030c\u0312\7\u00d9\2\2\u030d\u0313\7\33\2\2\u030e\u030f\7\r"+
		"\2\2\u030f\u0313\7\17\2\2\u0310\u0311\7\16\2\2\u0311\u0313\7\17\2\2\u0312"+
		"\u030d\3\2\2\2\u0312\u030e\3\2\2\2\u0312\u0310\3\2\2\2\u0313\u0315\3\2"+
		"\2\2\u0314\u030c\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u009b\3\2\2\2\u0316"+
		"\u0317\7\u00cf\2\2\u0317\u0318\5\u009aN\2\u0318\u031a\7\u013e\2\2\u0319"+
		"\u031b\5\u009eP\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c"+
		"\3\2\2\2\u031c\u031d\7\u013d\2\2\u031d\u0325\3\2\2\2\u031e\u031f\7E\2"+
		"\2\u031f\u0320\5\u009aN\2\u0320\u0321\7\u013e\2\2\u0321\u0322\5\u009e"+
		"P\2\u0322\u0323\7\u013d\2\2\u0323\u0325\3\2\2\2\u0324\u0316\3\2\2\2\u0324"+
		"\u031e\3\2\2\2\u0325\u009d\3\2\2\2\u0326\u032b\5\62\32\2\u0327\u0328\7"+
		"\u013b\2\2\u0328\u032a\5\62\32\2\u0329\u0327\3\2\2\2\u032a\u032d\3\2\2"+
		"\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u009f\3\2\2\2\u032d\u032b"+
		"\3\2\2\2\u032e\u032f\7 \2\2\u032f\u0330\7\u013e\2\2\u0330\u0331\5\u00a2"+
		"R\2\u0331\u0332\7\u013d\2\2\u0332\u00a1\3\2\2\2\u0333\u0338\5\64\33\2"+
		"\u0334\u0335\7\u013b\2\2\u0335\u0337\5\64\33\2\u0336\u0334\3\2\2\2\u0337"+
		"\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u00a3\3\2"+
		"\2\2\u033a\u0338\3\2\2\2\u033b\u033e\5\u00a6T\2\u033c\u033e\5\u00a8U\2"+
		"\u033d\u033b\3\2\2\2\u033d\u033c\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u0341"+
		"\7\u0138\2\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u00a5\3\2\2"+
		"\2\u0342\u0348\5\u00b0Y\2\u0343\u0348\5\u00d0i\2\u0344\u0348\5\u0122\u0092"+
		"\2\u0345\u0348\5\u0124\u0093\2\u0346\u0348\5\u0120\u0091\2\u0347\u0342"+
		"\3\2\2\2\u0347\u0343\3\2\2\2\u0347\u0344\3\2\2\2\u0347\u0345\3\2\2\2\u0347"+
		"\u0346\3\2\2\2\u0348\u00a7\3\2\2\2\u0349\u0350\5\u00aaV\2\u034a\u0350"+
		"\5\u00acW\2\u034b\u0350\5\u00aeX\2\u034c\u0350\5\u0118\u008d\2\u034d\u0350"+
		"\5\u011c\u008f\2\u034e\u0350\5\u011e\u0090\2\u034f\u0349\3\2\2\2\u034f"+
		"\u034a\3\2\2\2\u034f\u034b\3\2\2\2\u034f\u034c\3\2\2\2\u034f\u034d\3\2"+
		"\2\2\u034f\u034e\3\2\2\2\u0350\u00a9\3\2\2\2\u0351\u0356\5\u00dco\2\u0352"+
		"\u0356\5\u0110\u0089\2\u0353\u0356\5\u00dep\2\u0354\u0356\5\u010a\u0086"+
		"\2\u0355\u0351\3\2\2\2\u0355\u0352\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0354"+
		"\3\2\2\2\u0356\u00ab\3\2\2\2\u0357\u035c\5\u0102\u0082\2\u0358\u035c\5"+
		"\u0108\u0085\2\u0359\u035c\5\u0104\u0083\2\u035a\u035c\5\u0106\u0084\2"+
		"\u035b\u0357\3\2\2\2\u035b\u0358\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035a"+
		"\3\2\2\2\u035c\u00ad\3\2\2\2\u035d\u0362\5\u0112\u008a\2\u035e\u0362\5"+
		"\u0116\u008c\2\u035f\u0362\5\u00f4{\2\u0360\u0362\5\u010e\u0088\2\u0361"+
		"\u035d\3\2\2\2\u0361\u035e\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0360\3\2"+
		"\2\2\u0362\u00af\3\2\2\2\u0363\u0365\7\u013e\2\2\u0364\u0363\3\2\2\2\u0364"+
		"\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\5\u00b2Z\2\u0367\u0369"+
		"\7\u013d\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u0377\3\2\2"+
		"\2\u036a\u036c\7\63\2\2\u036b\u036d\t\21\2\2\u036c\u036b\3\2\2\2\u036c"+
		"\u036d\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u0370\7\u013e\2\2\u036f\u036e"+
		"\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373\5\u00b2Z"+
		"\2\u0372\u0374\7\u013d\2\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u0376\3\2\2\2\u0375\u036a\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2"+
		"\2\2\u0377\u0378\3\2\2\2\u0378\u00b1\3\2\2\2\u0379\u0377\3\2\2\2\u037a"+
		"\u037c\7\24\2\2\u037b\u037d\t\21\2\2\u037c\u037b\3\2\2\2\u037c\u037d\3"+
		"\2\2\2\u037d\u037e\3\2\2\2\u037e\u038a\5\u00c6d\2\u037f\u0380\7\22\2\2"+
		"\u0380\u0382\5\u008aF\2\u0381\u0383\5\u00b4[\2\u0382\u0381\3\2\2\2\u0382"+
		"\u0383\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u0386\5\u00b6\\\2\u0385\u0384"+
		"\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0389\5\u00ba^"+
		"\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u037f"+
		"\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u038e\5\u00bc_"+
		"\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u0391"+
		"\5\u00c0a\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u00b3\3\2\2"+
		"\2\u0392\u0393\7\21\2\2\u0393\u0394\5Z.\2\u0394\u00b5\3\2\2\2\u0395\u0396"+
		"\7\16\2\2\u0396\u0397\7\17\2\2\u0397\u039c\5\u00b8]\2\u0398\u0399\7\u013b"+
		"\2\2\u0399\u039b\5\u00b8]\2\u039a\u0398\3\2\2\2\u039b\u039e\3\2\2\2\u039c"+
		"\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u00b7\3\2\2\2\u039e\u039c\3\2"+
		"\2\2\u039f\u03a3\5\u0082B\2\u03a0\u03a3\7\u014a\2\2\u03a1\u03a3\5h\65"+
		"\2\u03a2\u039f\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3\u00b9"+
		"\3\2\2\2\u03a4\u03a5\7\20\2\2\u03a5\u03a6\5Z.\2\u03a6\u00bb\3\2\2\2\u03a7"+
		"\u03a8\7\r\2\2\u03a8\u03a9\7\17\2\2\u03a9\u03ae\5\u00be`\2\u03aa\u03ab"+
		"\7\u013b\2\2\u03ab\u03ad\5\u00be`\2\u03ac\u03aa\3\2\2\2\u03ad\u03b0\3"+
		"\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u00bd\3\2\2\2\u03b0"+
		"\u03ae\3\2\2\2\u03b1\u03b3\5\u00b8]\2\u03b2\u03b4\t\25\2\2\u03b3\u03b2"+
		"\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u00bf\3\2\2\2\u03b5\u03b9\7\u0094\2"+
		"\2\u03b6\u03b7\5\u00c2b\2\u03b7\u03b8\7\u013b\2\2\u03b8\u03ba\3\2\2\2"+
		"\u03b9\u03b6\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc"+
		"\5\u00c4c\2\u03bc\u00c1\3\2\2\2\u03bd\u03be\7\u014a\2\2\u03be\u00c3\3"+
		"\2\2\2\u03bf\u03c0\7\u014a\2\2\u03c0\u00c5\3\2\2\2\u03c1\u03c6\5\u00ce"+
		"h\2\u03c2\u03c3\7\u013b\2\2\u03c3\u03c5\5\u00ceh\2\u03c4\u03c2\3\2\2\2"+
		"\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u00c7"+
		"\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03ca\7\u013e\2\2\u03ca\u03cf\5\u0082"+
		"B\2\u03cb\u03cc\7\u013b\2\2\u03cc\u03ce\5\u0082B\2\u03cd\u03cb\3\2\2\2"+
		"\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2"+
		"\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d3\7\u013d\2\2\u03d3\u00c9\3\2\2"+
		"\2\u03d4\u03d5\7\u013e\2\2\u03d5\u03d6\5\u00b0Y\2\u03d6\u03d7\7\u013d"+
		"\2\2\u03d7\u00cb\3\2\2\2\u03d8\u03d9\5$\23\2\u03d9\u03da\7\u013a\2\2\u03da"+
		"\u03dc\3\2\2\2\u03db\u03d8\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2"+
		"\2\2\u03dd\u03de\5(\25\2\u03de\u00cd\3\2\2\2\u03df\u03ed\7\u013c\2\2\u03e0"+
		"\u03e1\5\u00ccg\2\u03e1\u03e2\7\u013a\2\2\u03e2\u03e3\7\u013c\2\2\u03e3"+
		"\u03ed\3\2\2\2\u03e4\u03e6\5\u0082B\2\u03e5\u03e7\5J&\2\u03e6\u03e5\3"+
		"\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03ed\3\2\2\2\u03e8\u03ea\5h\65\2\u03e9"+
		"\u03eb\5J&\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ed\3\2\2"+
		"\2\u03ec\u03df\3\2\2\2\u03ec\u03e0\3\2\2\2\u03ec\u03e4\3\2\2\2\u03ec\u03e8"+
		"\3\2\2\2\u03ed\u00cf\3\2\2\2\u03ee\u03f0\5\u00d2j\2\u03ef\u03f1\5\u00c8"+
		"e\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2"+
		"\u03f5\5\u00b2Z\2\u03f3\u03f5\5\u00d4k\2\u03f4\u03f2\3\2\2\2\u03f4\u03f3"+
		"\3\2\2\2\u03f5\u00d1\3\2\2\2\u03f6\u03f8\7\26\2\2\u03f7\u03f9\7^\2\2\u03f8"+
		"\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\5\u00cc"+
		"g\2\u03fb\u03fd\5\u00a0Q\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"\u00d3\3\2\2\2\u03fe\u03ff\t\26\2\2\u03ff\u0404\5\u00d6l\2\u0400\u0401"+
		"\7\u013b\2\2\u0401\u0403\5\u00d6l\2\u0402\u0400\3\2\2\2\u0403\u0406\3"+
		"\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u00d5\3\2\2\2\u0406"+
		"\u0404\3\2\2\2\u0407\u040a\7\u013e\2\2\u0408\u040b\5h\65\2\u0409\u040b"+
		"\7x\2\2\u040a\u0408\3\2\2\2\u040a\u0409\3\2\2\2\u040b\u0413\3\2\2\2\u040c"+
		"\u040f\7\u013b\2\2\u040d\u0410\5h\65\2\u040e\u0410\7x\2\2\u040f\u040d"+
		"\3\2\2\2\u040f\u040e\3\2\2\2\u0410\u0412\3\2\2\2\u0411\u040c\3\2\2\2\u0412"+
		"\u0415\3\2\2\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416\3\2"+
		"\2\2\u0415\u0413\3\2\2\2\u0416\u0417\7\u013d\2\2\u0417\u00d7\3\2\2\2\u0418"+
		"\u0419\7\u0095\2\2\u0419\u041e\5\u00dan\2\u041a\u041b\7\u013b\2\2\u041b"+
		"\u041d\5\u00dan\2\u041c\u041a\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c"+
		"\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u00d9\3\2\2\2\u0420\u041e\3\2\2\2\u0421"+
		"\u0422\5\u0082B\2\u0422\u0425\7\u0131\2\2\u0423\u0426\5Z.\2\u0424\u0426"+
		"\7x\2\2\u0425\u0423\3\2\2\2\u0425\u0424\3\2\2\2\u0426\u00db\3\2\2\2\u0427"+
		"\u0428\7;\2\2\u0428\u042c\t\27\2\2\u0429\u042a\7\t\2\2\u042a\u042b\7\6"+
		"\2\2\u042b\u042d\7\n\2\2\u042c\u0429\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u042f\5&\24\2\u042f\u00dd\3\2\2\2\u0430\u0433\5\u00e0"+
		"q\2\u0431\u0433\5\u00e2r\2\u0432\u0430\3\2\2\2\u0432\u0431\3\2\2\2\u0433"+
		"\u00df\3\2\2\2\u0434\u0436\7;\2\2\u0435\u0437\7\u0086\2\2\u0436\u0435"+
		"\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0439\3\2\2\2\u0438\u043a\7<\2\2\u0439"+
		"\u0438\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043f\7\""+
		"\2\2\u043c\u043d\7\t\2\2\u043d\u043e\7\6\2\2\u043e\u0440\7\n\2\2\u043f"+
		"\u043c\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u044d\5\u00cc"+
		"g\2\u0442\u0443\7\u013e\2\2\u0443\u0448\5\u00e4s\2\u0444\u0445\7\u013b"+
		"\2\2\u0445\u0447\5\u00e4s\2\u0446\u0444\3\2\2\2\u0447\u044a\3\2\2\2\u0448"+
		"\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a\u0448\3\2"+
		"\2\2\u044b\u044c\7\u013d\2\2\u044c\u044e\3\2\2\2\u044d\u0442\3\2\2\2\u044d"+
		"\u044e\3\2\2\2\u044e\u0451\3\2\2\2\u044f\u0450\7H\2\2\u0450\u0452\7\u014f"+
		"\2\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0455\3\2\2\2\u0453"+
		"\u0454\7\23\2\2\u0454\u0456\5\u00b0Y\2\u0455\u0453\3\2\2\2\u0455\u0456"+
		"\3\2\2\2\u0456\u00e1\3\2\2\2\u0457\u0459\7;\2\2\u0458\u045a\7\u0086\2"+
		"\2\u0459\u0458\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c\3\2\2\2\u045b\u045d"+
		"\7<\2\2\u045c\u045b\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\3\2\2\2\u045e"+
		"\u0462\7\"\2\2\u045f\u0460\7\t\2\2\u0460\u0461\7\6\2\2\u0461\u0463\7\n"+
		"\2\2\u0462\u045f\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"\u0466\5\u00ccg\2\u0465\u0467\7\u013e\2\2\u0466\u0465\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\7\7\2\2\u0469\u046b\5\u00ccg"+
		"\2\u046a\u046c\7\u013d\2\2\u046b\u046a\3\2\2\2\u046b\u046c\3\2\2\2\u046c"+
		"\u00e3\3\2\2\2\u046d\u046e\5,\27\2\u046e\u046f\5\u00e6t\2\u046f\u00e5"+
		"\3\2\2\2\u0470\u0473\5\u00eav\2\u0471\u0472\7H\2\2\u0472\u0474\7\u014f"+
		"\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u00e7\3\2\2\2\u0475"+
		"\u0476\7\6\2\2\u0476\u0479\7:\2\2\u0477\u0479\7:\2\2\u0478\u0475\3\2\2"+
		"\2\u0478\u0477\3\2\2\2\u0479\u00e9\3\2\2\2\u047a\u047f\7J\2\2\u047b\u047c"+
		"\7\u013e\2\2\u047c\u047d\5\u00eex\2\u047d\u047e\7\u013d\2\2\u047e\u0480"+
		"\3\2\2\2\u047f\u047b\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0482\3\2\2\2\u0481"+
		"\u0483\5\u00e8u\2\u0482\u0481\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u04ea"+
		"\3\2\2\2\u0484\u0489\7K\2\2\u0485\u0486\7\u013e\2\2\u0486\u0487\5\u00ee"+
		"x\2\u0487\u0488\7\u013d\2\2\u0488\u048a\3\2\2\2\u0489\u0485\3\2\2\2\u0489"+
		"\u048a\3\2\2\2\u048a\u048c\3\2\2\2\u048b\u048d\5\u00e8u\2\u048c\u048b"+
		"\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u04ea\3\2\2\2\u048e\u0493\7L\2\2\u048f"+
		"\u0490\7\u013e\2\2\u0490\u0491\5\u00eex\2\u0491\u0492\7\u013d\2\2\u0492"+
		"\u0494\3\2\2\2\u0493\u048f\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0496\3\2"+
		"\2\2\u0495\u0497\5\u00e8u\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497"+
		"\u04ea\3\2\2\2\u0498\u049d\7M\2\2\u0499\u049a\7\u013e\2\2\u049a\u049b"+
		"\5\u00eex\2\u049b\u049c\7\u013d\2\2\u049c\u049e\3\2\2\2\u049d\u0499\3"+
		"\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\3\2\2\2\u049f\u04a1\5\u00e8u\2"+
		"\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04ea\3\2\2\2\u04a2\u04a9"+
		"\7O\2\2\u04a3\u04a4\7\u013e\2\2\u04a4\u04a5\5\u00eex\2\u04a5\u04a6\7\u013b"+
		"\2\2\u04a6\u04a7\5\20\t\2\u04a7\u04a8\7\u013d\2\2\u04a8\u04aa\3\2\2\2"+
		"\u04a9\u04a3\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04ad"+
		"\5\u00e8u\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ea\3\2\2"+
		"\2\u04ae\u04b5\7N\2\2\u04af\u04b0\7\u013e\2\2\u04b0\u04b1\5\u00eex\2\u04b1"+
		"\u04b2\7\u013b\2\2\u04b2\u04b3\5\20\t\2\u04b3\u04b4\7\u013d\2\2\u04b4"+
		"\u04b6\3\2\2\2\u04b5\u04af\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\3\2"+
		"\2\2\u04b7\u04b9\5\u00e8u\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9"+
		"\u04ea\3\2\2\2\u04ba\u04c3\7S\2\2\u04bb\u04bc\7\u013e\2\2\u04bc\u04bf"+
		"\5\u00eex\2\u04bd\u04be\7\u013b\2\2\u04be\u04c0\5\20\t\2\u04bf\u04bd\3"+
		"\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\7\u013d\2\2"+
		"\u04c2\u04c4\3\2\2\2\u04c3\u04bb\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c6"+
		"\3\2\2\2\u04c5\u04c7\5\u00e8u\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3\2\2"+
		"\2\u04c7\u04ea\3\2\2\2\u04c8\u04ca\7P\2\2\u04c9\u04cb\5\u00e8u\2\u04ca"+
		"\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04ea\3\2\2\2\u04cc\u04ce\7R"+
		"\2\2\u04cd\u04cf\5\u00e8u\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf"+
		"\u04ea\3\2\2\2\u04d0\u04d2\7Q\2\2\u04d1\u04d3\5\u00e8u\2\u04d2\u04d1\3"+
		"\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04ea\3\2\2\2\u04d4\u04d5\7U\2\2\u04d5"+
		"\u04d6\7\u013e\2\2\u04d6\u04d7\5\u00f0y\2\u04d7\u04d9\7\u013d\2\2\u04d8"+
		"\u04da\5\u00e8u\2\u04d9\u04d8\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04ea"+
		"\3\2\2\2\u04db\u04e0\7\u00c2\2\2\u04dc\u04dd\7\u013e\2\2\u04dd\u04de\5"+
		"\u00f2z\2\u04de\u04df\7\u013d\2\2\u04df\u04e1\3\2\2\2\u04e0\u04dc\3\2"+
		"\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3\3\2\2\2\u04e2\u04e4\5\u00e8u\2\u04e3"+
		"\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04ea\3\2\2\2\u04e5\u04e7\7I"+
		"\2\2\u04e6\u04e8\5\u00e8u\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8"+
		"\u04ea\3\2\2\2\u04e9\u047a\3\2\2\2\u04e9\u0484\3\2\2\2\u04e9\u048e\3\2"+
		"\2\2\u04e9\u0498\3\2\2\2\u04e9\u04a2\3\2\2\2\u04e9\u04ae\3\2\2\2\u04e9"+
		"\u04ba\3\2\2\2\u04e9\u04c8\3\2\2\2\u04e9\u04cc\3\2\2\2\u04e9\u04d0\3\2"+
		"\2\2\u04e9\u04d4\3\2\2\2\u04e9\u04db\3\2\2\2\u04e9\u04e5\3\2\2\2\u04ea"+
		"\u00eb\3\2\2\2\u04eb\u04ef\5,\27\2\u04ec\u04ed\7\u013e\2\2\u04ed\u04ee"+
		"\7\u014a\2\2\u04ee\u04f0\7\u013d\2\2\u04ef\u04ec\3\2\2\2\u04ef\u04f0\3"+
		"\2\2\2\u04f0\u04f2\3\2\2\2\u04f1\u04f3\t\25\2\2\u04f2\u04f1\3\2\2\2\u04f2"+
		"\u04f3\3\2\2\2\u04f3\u00ed\3\2\2\2\u04f4\u04f5\7\u014a\2\2\u04f5\u00ef"+
		"\3\2\2\2\u04f6\u04f7\7\u014a\2\2\u04f7\u00f1\3\2\2\2\u04f8\u04f9\7\u014a"+
		"\2\2\u04f9\u00f3\3\2\2\2\u04fa\u04fb\7=\2\2\u04fb\u04fc\7\"\2\2\u04fc"+
		"\u0505\5\u00ccg\2\u04fd\u0502\5\u00f6|\2\u04fe\u04ff\7\u013b\2\2\u04ff"+
		"\u0501\5\u00f6|\2\u0500\u04fe\3\2\2\2\u0501\u0504\3\2\2\2\u0502\u0500"+
		"\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0506\3\2\2\2\u0504\u0502\3\2\2\2\u0505"+
		"\u04fd\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u00f5\3\2\2\2\u0507\u0508\7D"+
		"\2\2\u0508\u0509\7G\2\2\u0509\u0512\5\u00ccg\2\u050a\u050c\7>\2\2\u050b"+
		"\u050d\7?\2\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2"+
		"\2\2\u050e\u050f\5,\27\2\u050f\u0510\5,\27\2\u0510\u0512\3\2\2\2\u0511"+
		"\u0507\3\2\2\2\u0511\u050a\3\2\2\2\u0512\u00f7\3\2\2\2\u0513\u0518\5\u00ec"+
		"w\2\u0514\u0515\7\u013b\2\2\u0515\u0517\5\u00ecw\2\u0516\u0514\3\2\2\2"+
		"\u0517\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u00f9"+
		"\3\2\2\2\u051a\u0518\3\2\2\2\u051b\u051c\7/\2\2\u051c\u051d\7\u0120\2"+
		"\2\u051d\u00fb\3\2\2\2\u051e\u0522\5\u00fa~\2\u051f\u0520\7H\2\2\u0520"+
		"\u0522\7\u014f\2\2\u0521\u051e\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u00fd"+
		"\3\2\2\2\u0523\u0524\5,\27\2\u0524\u052b\5\u00e6t\2\u0525\u0526\7\u013b"+
		"\2\2\u0526\u0527\5,\27\2\u0527\u0528\5\u00e6t\2\u0528\u052a\3\2\2\2\u0529"+
		"\u0525\3\2\2\2\u052a\u052d\3\2\2\2\u052b\u0529\3\2\2\2\u052b\u052c\3\2"+
		"\2\2\u052c\u00ff\3\2\2\2\u052d\u052b\3\2\2\2\u052e\u052f\7D\2\2\u052f"+
		"\u0530\7\"\2\2\u0530\u0531\5\u00ccg\2\u0531\u0532\7G\2\2\u0532\u053a\5"+
		"\u00ccg\2\u0533\u0534\7\u013b\2\2\u0534\u0535\5\u00ccg\2\u0535\u0536\7"+
		"G\2\2\u0536\u0537\5\u00ccg\2\u0537\u0539\3\2\2\2\u0538\u0533\3\2\2\2\u0539"+
		"\u053c\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u0101\3\2"+
		"\2\2\u053c\u053a\3\2\2\2\u053d\u053e\7C\2\2\u053e\u0541\t\27\2\2\u053f"+
		"\u0540\7\t\2\2\u0540\u0542\7\n\2\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2"+
		"\2\2\u0542\u0543\3\2\2\2\u0543\u0544\5&\24\2\u0544\u0103\3\2\2\2\u0545"+
		"\u0546\7C\2\2\u0546\u0549\7\"\2\2\u0547\u0548\7\t\2\2\u0548\u054a\7\n"+
		"\2\2\u0549\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
		"\u054c\5\u00ccg\2\u054c\u0105\3\2\2\2\u054d\u054e\7C\2\2\u054e\u0551\7"+
		"\u00a7\2\2\u054f\u0550\7\t\2\2\u0550\u0552\7\n\2\2\u0551\u054f\3\2\2\2"+
		"\u0551\u0552\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\5\u00ccg\2\u0554"+
		"\u0107\3\2\2\2\u0555\u0556\7C\2\2\u0556\u0557\7\u00e7\2\2\u0557\u0558"+
		"\5@!\2\u0558\u0109\3\2\2\2\u0559\u055a\7;\2\2\u055a\u055b\5\u010c\u0087"+
		"\2\u055b\u010b\3\2\2\2\u055c\u0560\7\u00a7\2\2\u055d\u055e\5&\24\2\u055e"+
		"\u055f\7\u013a\2\2\u055f\u0561\3\2\2\2\u0560\u055d\3\2\2\2\u0560\u0561"+
		"\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0566\5.\30\2\u0563\u0564\7\t\2\2\u0564"+
		"\u0565\7\6\2\2\u0565\u0567\7\n\2\2\u0566\u0563\3\2\2\2\u0566\u0567\3\2"+
		"\2\2\u0567\u0569\3\2\2\2\u0568\u056a\5\u00c8e\2\u0569\u0568\3\2\2\2\u0569"+
		"\u056a\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\7\23\2\2\u056c\u056d\5"+
		"\u00b0Y\2\u056d\u010d\3\2\2\2\u056e\u056f\7=\2\2\u056f\u0570\5\u010c\u0087"+
		"\2\u0570\u010f\3\2\2\2\u0571\u0572\7;\2\2\u0572\u0573\7\u00e7\2\2\u0573"+
		"\u0574\5@!\2\u0574\u0575\7\u00eb\2\2\u0575\u0576\7\17\2\2\u0576\u0577"+
		"\7\u014f\2\2\u0577\u0111\3\2\2\2\u0578\u0579\7\u00ae\2\2\u0579\u057e\5"+
		"X-\2\u057a\u057b\7\u013b\2\2\u057b\u057d\5X-\2\u057c\u057a\3\2\2\2\u057d"+
		"\u0580\3\2\2\2\u057e\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0581\3\2"+
		"\2\2\u0580\u057e\3\2\2\2\u0581\u0584\7\37\2\2\u0582\u0585\5\u00ccg\2\u0583"+
		"\u0585\5.\30\2\u0584\u0582\3\2\2\2\u0584\u0583\3\2\2\2\u0585\u0586\3\2"+
		"\2\2\u0586\u0587\7G\2\2\u0587\u058c\5\u0114\u008b\2\u0588\u0589\7\u013b"+
		"\2\2\u0589\u058b\5\u0114\u008b\2\u058a\u0588\3\2\2\2\u058b\u058e\3\2\2"+
		"\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u0592\3\2\2\2\u058e\u058c"+
		"\3\2\2\2\u058f\u0590\7\u0090\2\2\u0590\u0591\7\u00ae\2\2\u0591\u0593\7"+
		"\u00d0\2\2\u0592\u058f\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0113\3\2\2\2"+
		"\u0594\u0596\7\u00e7\2\2\u0595\u0594\3\2\2\2\u0595\u0596\3\2\2\2\u0596"+
		"\u0597\3\2\2\2\u0597\u0598\5@!\2\u0598\u0115\3\2\2\2\u0599\u059d\7\u00af"+
		"\2\2\u059a\u059b\7\u00ae\2\2\u059b\u059c\7\u00d0\2\2\u059c\u059e\7\u00d9"+
		"\2\2\u059d\u059a\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f\3\2\2\2\u059f"+
		"\u05a4\5X-\2\u05a0\u05a1\7\u013b\2\2\u05a1\u05a3\5X-\2\u05a2\u05a0\3\2"+
		"\2\2\u05a3\u05a6\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5"+
		"\u05a7\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a7\u05aa\7\37\2\2\u05a8\u05ab\5"+
		"\u00ccg\2\u05a9\u05ab\5.\30\2\u05aa\u05a8\3\2\2\2\u05aa\u05a9\3\2\2\2"+
		"\u05ab\u05ac\3\2\2\2\u05ac\u05ad\7\22\2\2\u05ad\u05b2\5\u0114\u008b\2"+
		"\u05ae\u05af\7\u013b\2\2\u05af\u05b1\5\u0114\u008b\2\u05b0\u05ae\3\2\2"+
		"\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u0117"+
		"\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5\u05b6\7)\2\2\u05b6\u05b7\5\u011a\u008e"+
		"\2\u05b7\u0119\3\2\2\2\u05b8\u05b9\7;\2\2\u05b9\u05ba\t\30\2\2\u05ba\u05db"+
		"\5\u00ccg\2\u05bb\u05bc\7$\2\2\u05bc\u05bd\7\22\2\2\u05bd\u05db\5\u00cc"+
		"g\2\u05be\u05c1\t\31\2\2\u05bf\u05c0\7\7\2\2\u05c0\u05c2\7\u014f\2\2\u05c1"+
		"\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05db\3\2\2\2\u05c3\u05c6\7#"+
		"\2\2\u05c4\u05c5\7\u00a8\2\2\u05c5\u05c7\5&\24\2\u05c6\u05c4\3\2\2\2\u05c6"+
		"\u05c7\3\2\2\2\u05c7\u05c9\3\2\2\2\u05c8\u05ca\7\u014f\2\2\u05c9\u05c8"+
		"\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05db\3\2\2\2\u05cb\u05ce\7\u00ae\2"+
		"\2\u05cc\u05cf\5T+\2\u05cd\u05cf\5\u0114\u008b\2\u05ce\u05cc\3\2\2\2\u05ce"+
		"\u05cd\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d6\7\37"+
		"\2\2\u05d1\u05d7\7\5\2\2\u05d2\u05d4\7\"\2\2\u05d3\u05d2\3\2\2\2\u05d3"+
		"\u05d4\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7\5\u00ccg\2\u05d6\u05d1"+
		"\3\2\2\2\u05d6\u05d3\3\2\2\2\u05d7\u05db\3\2\2\2\u05d8\u05d9\7\u0119\2"+
		"\2\u05d9\u05db\7\u011a\2\2\u05da\u05b8\3\2\2\2\u05da\u05bb\3\2\2\2\u05da"+
		"\u05be\3\2\2\2\u05da\u05c3\3\2\2\2\u05da\u05cb\3\2\2\2\u05da\u05d8\3\2"+
		"\2\2\u05db\u011b\3\2\2\2\u05dc\u05dd\7\u0095\2\2\u05dd\u05de\7\"\2\2\u05de"+
		"\u05df\5\u00ccg\2\u05df\u05e0\7G\2\2\u05e0\u05e1\5N(\2\u05e1\u05e2\7\u013a"+
		"\2\2\u05e2\u05e3\5&\24\2\u05e3\u011d\3\2\2\2\u05e4\u05e5\7\u00cf\2\2\u05e5"+
		"\u05e6\5&\24\2\u05e6\u011f\3\2\2\2\u05e7\u05e8\7\u0119\2\2\u05e8\u05e9"+
		"\7\u011b\2\2\u05e9\u05ea\5N(\2\u05ea\u05eb\5\u00a4S\2\u05eb\u0121\3\2"+
		"\2\2\u05ec\u05ed\7\u00d2\2\2\u05ed\u05ee\5\u00ccg\2\u05ee\u05ef\5\u00d8"+
		"m\2\u05ef\u05f0\5\u00b4[\2\u05f0\u0123\3\2\2\2\u05f1\u05f2\7\u00a4\2\2"+
		"\u05f2\u05f3\7\22\2\2\u05f3\u05f5\5\u00ccg\2\u05f4\u05f6\5\u00b4[\2\u05f5"+
		"\u05f4\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u0125\3\2\2\2\u00bd\u0137\u013d"+
		"\u0141\u014a\u014d\u0151\u0155\u0157\u015e\u016b\u0171\u01a4\u01b6\u01bf"+
		"\u01c7\u01cf\u01d3\u01da\u01de\u01e0\u01e9\u01ee\u01f3\u01f7\u01fc\u0200"+
		"\u0209\u0210\u0216\u021b\u0220\u0225\u022c\u0234\u023a\u023f\u024c\u0255"+
		"\u0258\u025b\u0267\u026b\u026f\u0273\u027d\u0281\u0285\u0290\u0294\u029b"+
		"\u02a4\u02ab\u02ad\u02b5\u02c3\u02c8\u02cc\u02d1\u02d5\u02db\u02e3\u02e9"+
		"\u02eb\u02ef\u02f3\u02f7\u02fe\u0308\u0312\u0314\u031a\u0324\u032b\u0338"+
		"\u033d\u0340\u0347\u034f\u0355\u035b\u0361\u0364\u0368\u036c\u036f\u0373"+
		"\u0377\u037c\u0382\u0385\u0388\u038a\u038d\u0390\u039c\u03a2\u03ae\u03b3"+
		"\u03b9\u03c6\u03cf\u03db\u03e6\u03ea\u03ec\u03f0\u03f4\u03f8\u03fc\u0404"+
		"\u040a\u040f\u0413\u041e\u0425\u042c\u0432\u0436\u0439\u043f\u0448\u044d"+
		"\u0451\u0455\u0459\u045c\u0462\u0466\u046b\u0473\u0478\u047f\u0482\u0489"+
		"\u048c\u0493\u0496\u049d\u04a0\u04a9\u04ac\u04b5\u04b8\u04bf\u04c3\u04c6"+
		"\u04ca\u04ce\u04d2\u04d9\u04e0\u04e3\u04e7\u04e9\u04ef\u04f2\u0502\u0505"+
		"\u050c\u0511\u0518\u0521\u052b\u053a\u0541\u0549\u0551\u0560\u0566\u0569"+
		"\u057e\u0584\u058c\u0592\u0595\u059d\u05a4\u05aa\u05b2\u05c1\u05c6\u05c9"+
		"\u05ce\u05d3\u05d6\u05da\u05f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}