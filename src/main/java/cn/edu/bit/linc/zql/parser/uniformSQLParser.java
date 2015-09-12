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
		TRUE=1, FALSE=2, ALL=3, NOT=4, LIKE=5, IF=6, EXISTS=7, ASC=8, DESC=9, 
		ORDER=10, GROUP=11, BY=12, HAVING=13, WHERE=14, FROM=15, AS=16, SELECT=17, 
		DISTINCT=18, INSERT=19, OVERWRITE=20, OUTER=21, UNIQUEJOIN=22, PRESERVE=23, 
		JOIN=24, LEFT=25, RIGHT=26, FULL=27, ON=28, PARTITION=29, PARTITIONS=30, 
		TABLE=31, TABLES=32, COLUMNS=33, INDEX=34, INDEXES=35, REBUILD=36, FUNCTIONS=37, 
		SHOW=38, MSCK=39, REPAIR=40, DIRECTORY=41, LOCAL=42, TRANSFORM=43, USING=44, 
		CLUSTER=45, DISTRIBUTE=46, SORT=47, UNION=48, LOAD=49, EXPORT=50, IMPORT=51, 
		DATA=52, INPATH=53, IS=54, NULL=55, CREATE=56, EXTERNAL=57, ALTER=58, 
		CHANGE=59, COLUMN=60, FIRST=61, AFTER=62, DESCRIBE=63, DROP=64, RENAME=65, 
		IGNORE=66, PROTECTION=67, TO=68, COMMENT=69, BOOLEAN=70, TINYINT=71, SMALLINT=72, 
		INT=73, BIGINT=74, FLOAT=75, DOUBLE=76, DATE=77, DATETIME=78, TIMESTAMP=79, 
		DECIMAL=80, STRING=81, VARCHAR=82, ARRAY=83, STRUCT=84, MAP=85, UNIONTYPE=86, 
		REDUCE=87, PARTITIONED=88, CLUSTERED=89, SORTED=90, INTO=91, BUCKETS=92, 
		ROW=93, ROWS=94, FORMAT=95, DELIMITED=96, FIELDS=97, TERMINATED=98, ESCAPED=99, 
		COLLECTION=100, ITEMS=101, KEYS=102, KEY=103, LINES=104, STORED=105, FILEFORMAT=106, 
		SEQUENCEFILE=107, TEXTFILE=108, RCFILE=109, ORCFILE=110, INPUTFORMAT=111, 
		OUTPUTFORMAT=112, INPUTDRIVER=113, OUTPUTDRIVER=114, OFFLINE=115, ENABLE=116, 
		DEFAULT=117, DISABLE=118, READONLY=119, LOCATION=120, TABLESAMPLE=121, 
		BUCKET=122, OUT=123, OF=124, PERCENT=125, CAST=126, ADD=127, REPLACE=128, 
		RLIKE=129, REGEXP=130, TEMPORARY=131, FUNCTION=132, MACRO=133, EXPLAIN=134, 
		EXTENDED=135, FORMATTED=136, PRETTY=137, DEPENDENCY=138, LOGICAL=139, 
		SERDE=140, WITH=141, DEFERRED=142, SERDEPROPERTIES=143, DBPROPERTIES=144, 
		LIMIT=145, SET=146, UNSET=147, TBLPROPERTIES=148, IDXPROPERTIES=149, CASCADED=150, 
		CASE=151, WHEN=152, THEN=153, ELSE=154, END=155, MAPJOIN=156, STREAMTABLE=157, 
		CLUSTERSTATUS=158, UTC=159, LONG=160, DELETE=161, FETCH=162, INTERSECT=163, 
		VIEW=164, IN=165, DATABASE=166, DATABASES=167, MATERIALIZED=168, SCHEMA=169, 
		SCHEMAS=170, GRANT=171, REVOKE=172, SSL=173, UNDO=174, LOCK=175, LOCKS=176, 
		UNLOCK=177, SHARED=178, EXCLUSIVE=179, PROCEDURE=180, UNSIGNED=181, WHILE=182, 
		READ=183, READS=184, PURGE=185, RANGE=186, ANALYZE=187, BEFORE=188, BETWEEN=189, 
		BOTH=190, BINARY=191, CROSS=192, CONTINUE=193, CURSOR=194, TRIGGER=195, 
		RECORDREADER=196, RECORDWRITER=197, LATERAL=198, TOUCH=199, ARCHIVE=200, 
		UNARCHIVE=201, COMPUTE=202, STATISTICS=203, USE=204, OPTION=205, CONCATENATE=206, 
		UPDATE=207, RESTRICT=208, CASCADE=209, SKEWED=210, ROLLUP=211, CUBE=212, 
		DIRECTORIES=213, FOR=214, WINDOW=215, UNBOUNDED=216, PRECEDING=217, FOLLOWING=218, 
		CURRENT=219, LESS=220, MORE=221, OVER=222, GROUPING=223, SETS=224, TRUNCATE=225, 
		NOSCAN=226, PARTIALSCAN=227, USER=228, ROLE=229, INNER=230, EXCHANGE=231, 
		IDENTIFIED=232, CHAR=233, ABS=234, ACOS=235, ASIN=236, ATAN=237, CEIL=238, 
		COS=239, COT=240, EXP=241, FLOOR=242, LN=243, POW=244, RAND=245, ROUND=246, 
		SIN=247, SQRT=248, TAN=249, LCASE=250, LOWER=251, LTRIM=252, RTRIM=253, 
		CONCAT=254, SUBSTR=255, TRIM=256, UCASE=257, UPPER=258, INTERVAL=259, 
		TO_DATE=260, DAY=261, HOUR=262, MINUTE=263, MONTH=264, SECOND=265, FROM_UNIXTIME=266, 
		YEAR=267, DATE_ADD=268, DATE_SUB=269, COLLATE=270, AVG=271, COUNT=272, 
		MAX=273, MIN=274, SUM=275, COALESCE=276, DUPLICATE=277, SERVER=278, ALIASES=279, 
		ALIAS=280, VALUES=281, VALUE=282, LOW_PRIORITY=283, HIGH_PRIORITY=284, 
		HASH=285, REFERENCES=286, TO_CHAR=287, DATE_FORMAT=288, SIGNED=289, INTEGER=290, 
		LENGTH=291, REVERSE=292, IFNULL=293, DIVIDE=294, MOD=295, OR=296, AND=297, 
		XOR=298, ARROW=299, EQ=300, NOT_EQ=301, LET=302, GET=303, SET_VAR=304, 
		SHIFT_LEFT=305, SHIFT_RIGHT=306, SEMI=307, COLON=308, DOT=309, COMMA=310, 
		ASTERISK=311, RPAREN=312, LPAREN=313, RBRACK=314, LBRACK=315, PLUS=316, 
		MINUS=317, NEGATION=318, VERTBAR=319, BITAND=320, POWER_OP=321, GTH=322, 
		LTH=323, Double_Quote=324, INTEGER_NUM=325, VARCHAR_NUM=326, BINARY_NUM=327, 
		HEX_DIGIT=328, BIT_NUM=329, REAL_NUMBER=330, TEXT_STRING=331, ID=332, 
		LINE_COMMENT=333, BLOCKCOMMENT=334, WHITE_SPACE=335, SL_COMMENT=336, Regex_Escaped_Unicode=337;
	public static final int
		RULE_keyword = 0, RULE_delimited_statement = 1, RULE_integer_types = 2, 
		RULE_relational_op = 3, RULE_cast_data_type = 4, RULE_interval_unit = 5, 
		RULE_string_literal = 6, RULE_number_literal = 7, RULE_hex_literal = 8, 
		RULE_boolean_literal = 9, RULE_bit_literal = 10, RULE_literal_value = 11, 
		RULE_functionList = 12, RULE_number_functions = 13, RULE_char_functions = 14, 
		RULE_time_functions = 15, RULE_other_functions = 16, RULE_group_functions = 17, 
		RULE_schema_name = 18, RULE_database_name = 19, RULE_table_name = 20, 
		RULE_engine_name = 21, RULE_column_name = 22, RULE_view_name = 23, RULE_parser_name = 24, 
		RULE_index_name = 25, RULE_partition_name = 26, RULE_partition_logical_name = 27, 
		RULE_constraintbol_name = 28, RULE_foreign_keybol_name = 29, RULE_collation_name = 30, 
		RULE_event_name = 31, RULE_user_name = 32, RULE_function_name = 33, RULE_procedure_name = 34, 
		RULE_server_name = 35, RULE_wrapper_name = 36, RULE_alias = 37, RULE_password = 38, 
		RULE_server_alias_name = 39, RULE_role_name = 40, RULE_group_name = 41, 
		RULE_principal_name = 42, RULE_any_name = 43, RULE_priv_type = 44, RULE_expression = 45, 
		RULE_exp_factor1 = 46, RULE_exp_factor2 = 47, RULE_exp_factor3 = 48, RULE_exp_factor4 = 49, 
		RULE_bool_primary = 50, RULE_predicate = 51, RULE_bit_expr = 52, RULE_factor1 = 53, 
		RULE_factor2 = 54, RULE_factor3 = 55, RULE_factor4 = 56, RULE_factor5 = 57, 
		RULE_factor6 = 58, RULE_factor7 = 59, RULE_simple_expr = 60, RULE_function_call = 61, 
		RULE_case_when_statement = 62, RULE_case_when_statement1 = 63, RULE_case_when_statement2 = 64, 
		RULE_column_spec = 65, RULE_raw_expression_list = 66, RULE_expression_list = 67, 
		RULE_interval_expr = 68, RULE_table_references = 69, RULE_table_reference = 70, 
		RULE_table_factor1 = 71, RULE_table_factor2 = 72, RULE_table_factor3 = 73, 
		RULE_table_atom = 74, RULE_join_condition = 75, RULE_index_hint_list = 76, 
		RULE_index_options = 77, RULE_index_hint = 78, RULE_index_list = 79, RULE_partition_clause = 80, 
		RULE_partition_names = 81, RULE_root_statement = 82, RULE_data_manipulation_statements = 83, 
		RULE_data_definition_statements = 84, RULE_select_statement = 85, RULE_select_expression = 86, 
		RULE_where_clause = 87, RULE_groupby_clause = 88, RULE_groupby_item = 89, 
		RULE_having_clause = 90, RULE_orderby_clause = 91, RULE_orderby_item = 92, 
		RULE_limit_clause = 93, RULE_offset = 94, RULE_row_count = 95, RULE_select_list = 96, 
		RULE_column_list = 97, RULE_subquery = 98, RULE_table_spec = 99, RULE_displayed_column = 100, 
		RULE_insert_statements = 101, RULE_insert_header = 102, RULE_insert_subfix = 103, 
		RULE_insert_statement = 104, RULE_value_list_clause = 105, RULE_column_value_list = 106, 
		RULE_set_columns_cluase = 107, RULE_set_column_cluase = 108, RULE_create_database_statement = 109, 
		RULE_drop_database_statement = 110, RULE_create_table_statement = 111, 
		RULE_create_table_statement1 = 112, RULE_create_table_statement2 = 113, 
		RULE_create_table_statement3 = 114, RULE_create_definition = 115, RULE_column_definition = 116, 
		RULE_null_or_notnull = 117, RULE_column_data_type_header = 118, RULE_index_column_name = 119, 
		RULE_reference_definition = 120, RULE_reference_option = 121, RULE_length = 122, 
		RULE_varchar_length = 123, RULE_binary_length = 124, RULE_alter_table_statement = 125, 
		RULE_alter_table_specification = 126, RULE_index_column_names = 127, RULE_index_type = 128, 
		RULE_index_option = 129, RULE_column_definitions = 130, RULE_rename_table_statement = 131, 
		RULE_drop_table_statement = 132, RULE_drop_view_statement = 133, RULE_truncate_table_statement = 134, 
		RULE_create_view_statement = 135, RULE_create_view_body = 136, RULE_alter_view_statement = 137, 
		RULE_create_user_statement = 138, RULE_drop_user_statement = 139, RULE_grant_privilege_statement = 140, 
		RULE_principal_specification = 141, RULE_revoke_privilege_statement = 142, 
		RULE_show_event_statement = 143, RULE_show_specification = 144, RULE_set_event_statement = 145, 
		RULE_use_event_statement = 146, RULE_server_event_statement = 147, RULE_update_statements = 148, 
		RULE_delete_statements = 149;
	public static final String[] ruleNames = {
		"keyword", "delimited_statement", "integer_types", "relational_op", "cast_data_type", 
		"interval_unit", "string_literal", "number_literal", "hex_literal", "boolean_literal", 
		"bit_literal", "literal_value", "functionList", "number_functions", "char_functions", 
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
		"data_manipulation_statements", "data_definition_statements", "select_statement", 
		"select_expression", "where_clause", "groupby_clause", "groupby_item", 
		"having_clause", "orderby_clause", "orderby_item", "limit_clause", "offset", 
		"row_count", "select_list", "column_list", "subquery", "table_spec", "displayed_column", 
		"insert_statements", "insert_header", "insert_subfix", "insert_statement", 
		"value_list_clause", "column_value_list", "set_columns_cluase", "set_column_cluase", 
		"create_database_statement", "drop_database_statement", "create_table_statement", 
		"create_table_statement1", "create_table_statement2", "create_table_statement3", 
		"create_definition", "column_definition", "null_or_notnull", "column_data_type_header", 
		"index_column_name", "reference_definition", "reference_option", "length", 
		"varchar_length", "binary_length", "alter_table_statement", "alter_table_specification", 
		"index_column_names", "index_type", "index_option", "column_definitions", 
		"rename_table_statement", "drop_table_statement", "drop_view_statement", 
		"truncate_table_statement", "create_view_statement", "create_view_body", 
		"alter_view_statement", "create_user_statement", "drop_user_statement", 
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
		null, null, null, null, null, null, null, null, null, null, null, "'=>'", 
		null, null, "'<='", "'>='", "':='", "'<<'", "'>>'", "';'", "':'", "'.'", 
		"','", "'*'", "')'", "'('", "']'", "'['", "'+'", "'-'", "'~'", "'|'", 
		"'&'", "'^'", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TRUE", "FALSE", "ALL", "NOT", "LIKE", "IF", "EXISTS", "ASC", "DESC", 
		"ORDER", "GROUP", "BY", "HAVING", "WHERE", "FROM", "AS", "SELECT", "DISTINCT", 
		"INSERT", "OVERWRITE", "OUTER", "UNIQUEJOIN", "PRESERVE", "JOIN", "LEFT", 
		"RIGHT", "FULL", "ON", "PARTITION", "PARTITIONS", "TABLE", "TABLES", "COLUMNS", 
		"INDEX", "INDEXES", "REBUILD", "FUNCTIONS", "SHOW", "MSCK", "REPAIR", 
		"DIRECTORY", "LOCAL", "TRANSFORM", "USING", "CLUSTER", "DISTRIBUTE", "SORT", 
		"UNION", "LOAD", "EXPORT", "IMPORT", "DATA", "INPATH", "IS", "NULL", "CREATE", 
		"EXTERNAL", "ALTER", "CHANGE", "COLUMN", "FIRST", "AFTER", "DESCRIBE", 
		"DROP", "RENAME", "IGNORE", "PROTECTION", "TO", "COMMENT", "BOOLEAN", 
		"TINYINT", "SMALLINT", "INT", "BIGINT", "FLOAT", "DOUBLE", "DATE", "DATETIME", 
		"TIMESTAMP", "DECIMAL", "STRING", "VARCHAR", "ARRAY", "STRUCT", "MAP", 
		"UNIONTYPE", "REDUCE", "PARTITIONED", "CLUSTERED", "SORTED", "INTO", "BUCKETS", 
		"ROW", "ROWS", "FORMAT", "DELIMITED", "FIELDS", "TERMINATED", "ESCAPED", 
		"COLLECTION", "ITEMS", "KEYS", "KEY", "LINES", "STORED", "FILEFORMAT", 
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
		"REVERSE", "IFNULL", "DIVIDE", "MOD", "OR", "AND", "XOR", "ARROW", "EQ", 
		"NOT_EQ", "LET", "GET", "SET_VAR", "SHIFT_LEFT", "SHIFT_RIGHT", "SEMI", 
		"COLON", "DOT", "COMMA", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", "LBRACK", 
		"PLUS", "MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", "GTH", "LTH", 
		"Double_Quote", "INTEGER_NUM", "VARCHAR_NUM", "BINARY_NUM", "HEX_DIGIT", 
		"BIT_NUM", "REAL_NUMBER", "TEXT_STRING", "ID", "LINE_COMMENT", "BLOCKCOMMENT", 
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
		public TerminalNode END() { return getToken(uniformSQLParser.END, 0); }
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
			setState(300);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ALL) | (1L << NOT) | (1L << LIKE) | (1L << IF) | (1L << EXISTS) | (1L << ASC) | (1L << DESC) | (1L << ORDER) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << WHERE) | (1L << FROM) | (1L << AS) | (1L << SELECT) | (1L << DISTINCT) | (1L << INSERT) | (1L << OVERWRITE) | (1L << OUTER) | (1L << UNIQUEJOIN) | (1L << PRESERVE) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL) | (1L << ON) | (1L << PARTITION) | (1L << PARTITIONS) | (1L << TABLE) | (1L << TABLES) | (1L << COLUMNS) | (1L << INDEX) | (1L << INDEXES) | (1L << REBUILD) | (1L << FUNCTIONS) | (1L << SHOW) | (1L << MSCK) | (1L << REPAIR) | (1L << DIRECTORY) | (1L << LOCAL) | (1L << TRANSFORM) | (1L << USING) | (1L << CLUSTER) | (1L << DISTRIBUTE) | (1L << SORT) | (1L << UNION) | (1L << LOAD) | (1L << EXPORT) | (1L << IMPORT) | (1L << DATA) | (1L << INPATH) | (1L << IS) | (1L << NULL) | (1L << CREATE) | (1L << EXTERNAL) | (1L << ALTER) | (1L << CHANGE) | (1L << COLUMN) | (1L << FIRST) | (1L << AFTER) | (1L << DESCRIBE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DROP - 64)) | (1L << (RENAME - 64)) | (1L << (IGNORE - 64)) | (1L << (PROTECTION - 64)) | (1L << (TO - 64)) | (1L << (COMMENT - 64)) | (1L << (BOOLEAN - 64)) | (1L << (TINYINT - 64)) | (1L << (SMALLINT - 64)) | (1L << (INT - 64)) | (1L << (BIGINT - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (DATE - 64)) | (1L << (DATETIME - 64)) | (1L << (TIMESTAMP - 64)) | (1L << (DECIMAL - 64)) | (1L << (STRING - 64)) | (1L << (VARCHAR - 64)) | (1L << (ARRAY - 64)) | (1L << (STRUCT - 64)) | (1L << (MAP - 64)) | (1L << (UNIONTYPE - 64)) | (1L << (REDUCE - 64)) | (1L << (PARTITIONED - 64)) | (1L << (CLUSTERED - 64)) | (1L << (SORTED - 64)) | (1L << (INTO - 64)) | (1L << (BUCKETS - 64)) | (1L << (ROW - 64)) | (1L << (ROWS - 64)) | (1L << (FORMAT - 64)) | (1L << (DELIMITED - 64)) | (1L << (FIELDS - 64)) | (1L << (TERMINATED - 64)) | (1L << (ESCAPED - 64)) | (1L << (COLLECTION - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (KEY - 64)) | (1L << (LINES - 64)) | (1L << (STORED - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (SEQUENCEFILE - 64)) | (1L << (TEXTFILE - 64)) | (1L << (RCFILE - 64)) | (1L << (ORCFILE - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (OUTPUTFORMAT - 64)) | (1L << (INPUTDRIVER - 64)) | (1L << (OUTPUTDRIVER - 64)) | (1L << (OFFLINE - 64)) | (1L << (ENABLE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DISABLE - 64)) | (1L << (READONLY - 64)) | (1L << (LOCATION - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (BUCKET - 64)) | (1L << (OUT - 64)) | (1L << (OF - 64)) | (1L << (PERCENT - 64)) | (1L << (CAST - 64)) | (1L << (ADD - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (REPLACE - 128)) | (1L << (RLIKE - 128)) | (1L << (REGEXP - 128)) | (1L << (TEMPORARY - 128)) | (1L << (FUNCTION - 128)) | (1L << (MACRO - 128)) | (1L << (EXPLAIN - 128)) | (1L << (EXTENDED - 128)) | (1L << (FORMATTED - 128)) | (1L << (PRETTY - 128)) | (1L << (DEPENDENCY - 128)) | (1L << (LOGICAL - 128)) | (1L << (SERDE - 128)) | (1L << (WITH - 128)) | (1L << (DEFERRED - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (LIMIT - 128)) | (1L << (SET - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (IDXPROPERTIES - 128)) | (1L << (CASCADED - 128)) | (1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (END - 128)) | (1L << (MAPJOIN - 128)) | (1L << (STREAMTABLE - 128)) | (1L << (CLUSTERSTATUS - 128)) | (1L << (UTC - 128)) | (1L << (LONG - 128)) | (1L << (DELETE - 128)) | (1L << (FETCH - 128)) | (1L << (INTERSECT - 128)) | (1L << (VIEW - 128)) | (1L << (IN - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (GRANT - 128)) | (1L << (REVOKE - 128)) | (1L << (SSL - 128)) | (1L << (UNDO - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (UNLOCK - 128)) | (1L << (SHARED - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (PROCEDURE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (WHILE - 128)) | (1L << (READ - 128)) | (1L << (READS - 128)) | (1L << (PURGE - 128)) | (1L << (RANGE - 128)) | (1L << (ANALYZE - 128)) | (1L << (BEFORE - 128)) | (1L << (BETWEEN - 128)) | (1L << (BOTH - 128)) | (1L << (BINARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (CROSS - 192)) | (1L << (CONTINUE - 192)) | (1L << (CURSOR - 192)) | (1L << (TRIGGER - 192)) | (1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (LATERAL - 192)) | (1L << (TOUCH - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (COMPUTE - 192)) | (1L << (STATISTICS - 192)) | (1L << (USE - 192)) | (1L << (OPTION - 192)) | (1L << (CONCATENATE - 192)) | (1L << (UPDATE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CASCADE - 192)) | (1L << (SKEWED - 192)) | (1L << (ROLLUP - 192)) | (1L << (CUBE - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (FOR - 192)) | (1L << (WINDOW - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (PRECEDING - 192)) | (1L << (FOLLOWING - 192)) | (1L << (CURRENT - 192)) | (1L << (LESS - 192)) | (1L << (MORE - 192)) | (1L << (OVER - 192)) | (1L << (GROUPING - 192)) | (1L << (SETS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (NOSCAN - 192)) | (1L << (PARTIALSCAN - 192)) | (1L << (USER - 192)) | (1L << (ROLE - 192)) | (1L << (INNER - 192)) | (1L << (EXCHANGE - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (CHAR - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ASIN - 192)) | (1L << (ATAN - 192)) | (1L << (CEIL - 192)) | (1L << (COS - 192)) | (1L << (COT - 192)) | (1L << (EXP - 192)) | (1L << (FLOOR - 192)) | (1L << (LN - 192)) | (1L << (POW - 192)) | (1L << (RAND - 192)) | (1L << (ROUND - 192)) | (1L << (SIN - 192)) | (1L << (SQRT - 192)) | (1L << (TAN - 192)) | (1L << (LCASE - 192)) | (1L << (LOWER - 192)) | (1L << (LTRIM - 192)) | (1L << (RTRIM - 192)) | (1L << (CONCAT - 192)) | (1L << (SUBSTR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRIM - 256)) | (1L << (UCASE - 256)) | (1L << (UPPER - 256)) | (1L << (INTERVAL - 256)) | (1L << (TO_DATE - 256)) | (1L << (DAY - 256)) | (1L << (HOUR - 256)) | (1L << (MINUTE - 256)) | (1L << (MONTH - 256)) | (1L << (SECOND - 256)) | (1L << (FROM_UNIXTIME - 256)) | (1L << (YEAR - 256)) | (1L << (DATE_ADD - 256)) | (1L << (DATE_SUB - 256)) | (1L << (COLLATE - 256)) | (1L << (AVG - 256)) | (1L << (COUNT - 256)) | (1L << (MAX - 256)) | (1L << (MIN - 256)) | (1L << (SUM - 256)) | (1L << (COALESCE - 256)) | (1L << (DUPLICATE - 256)) | (1L << (SERVER - 256)) | (1L << (ALIASES - 256)) | (1L << (ALIAS - 256)) | (1L << (VALUES - 256)) | (1L << (VALUE - 256)) | (1L << (LOW_PRIORITY - 256)) | (1L << (HIGH_PRIORITY - 256)) | (1L << (HASH - 256)) | (1L << (REFERENCES - 256)) | (1L << (TO_CHAR - 256)) | (1L << (DATE_FORMAT - 256)) | (1L << (SIGNED - 256)) | (1L << (INTEGER - 256)) | (1L << (LENGTH - 256)) | (1L << (REVERSE - 256)) | (1L << (IFNULL - 256)) | (1L << (DIVIDE - 256)) | (1L << (MOD - 256)) | (1L << (OR - 256)) | (1L << (AND - 256)) | (1L << (XOR - 256)) | (1L << (ARROW - 256)) | (1L << (EQ - 256)) | (1L << (NOT_EQ - 256)) | (1L << (LET - 256)) | (1L << (GET - 256)) | (1L << (SET_VAR - 256)) | (1L << (SHIFT_LEFT - 256)) | (1L << (SHIFT_RIGHT - 256)))) != 0)) ) {
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
			setState(302);
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
			setState(317);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(TINYINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(SMALLINT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(INT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				match(BIGINT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				match(BOOLEAN);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				match(DOUBLE);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(312);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 10);
				{
				setState(313);
				match(TIMESTAMP);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(314);
				match(VARCHAR);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 12);
				{
				setState(315);
				match(BINARY);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 13);
				{
				setState(316);
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
			setState(319);
			_la = _input.LA(1);
			if ( !(((((_la - 300)) & ~0x3f) == 0 && ((1L << (_la - 300)) & ((1L << (EQ - 300)) | (1L << (NOT_EQ - 300)) | (1L << (LET - 300)) | (1L << (GET - 300)) | (1L << (GTH - 300)) | (1L << (LTH - 300)))) != 0)) ) {
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
			setState(349);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(BINARY);
				setState(323);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(322);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(CHAR);
				setState(327);
				_la = _input.LA(1);
				if (_la==INTEGER_NUM) {
					{
					setState(326);
					match(INTEGER_NUM);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(DATETIME);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				match(DECIMAL);
				setState(339);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(332);
					match(LPAREN);
					setState(333);
					match(INTEGER_NUM);
					setState(336);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(334);
						match(COMMA);
						setState(335);
						match(INTEGER_NUM);
						}
					}

					setState(338);
					match(RPAREN);
					}
				}

				}
				break;
			case SIGNED:
				enterOuterAlt(_localctx, 6);
				{
				setState(341);
				match(SIGNED);
				setState(343);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(342);
					match(INTEGER);
					}
				}

				}
				break;
			case UNSIGNED:
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				match(UNSIGNED);
				setState(347);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(346);
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
			setState(351);
			_la = _input.LA(1);
			if ( !(((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (DAY - 261)) | (1L << (HOUR - 261)) | (1L << (MINUTE - 261)) | (1L << (MONTH - 261)) | (1L << (SECOND - 261)) | (1L << (YEAR - 261)))) != 0)) ) {
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
			setState(353);
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
			setState(356);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(355);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(358);
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
			setState(360);
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
			setState(362);
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

	public static class Bit_literalContext extends ParserRuleContext {
		public TerminalNode BIT_NUM() { return getToken(uniformSQLParser.BIT_NUM, 0); }
		public Bit_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitBit_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_literalContext bit_literal() throws RecognitionException {
		Bit_literalContext _localctx = new Bit_literalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bit_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(BIT_NUM);
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
		public Bit_literalContext bit_literal() {
			return getRuleContext(Bit_literalContext.class,0);
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
		enterRule(_localctx, 22, RULE_literal_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			switch (_input.LA(1)) {
			case TEXT_STRING:
				{
				setState(366);
				string_literal();
				}
				break;
			case PLUS:
			case MINUS:
			case INTEGER_NUM:
			case REAL_NUMBER:
				{
				setState(367);
				number_literal();
				}
				break;
			case HEX_DIGIT:
				{
				setState(368);
				hex_literal();
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(369);
				boolean_literal();
				}
				break;
			case BIT_NUM:
				{
				setState(370);
				bit_literal();
				}
				break;
			case NULL:
				{
				setState(371);
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
		enterRule(_localctx, 24, RULE_functionList);
		try {
			setState(378);
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
				setState(374);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
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
				setState(376);
				time_functions();
				}
				break;
			case COALESCE:
			case IFNULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
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
		enterRule(_localctx, 26, RULE_number_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !(((((_la - 234)) & ~0x3f) == 0 && ((1L << (_la - 234)) & ((1L << (ABS - 234)) | (1L << (ACOS - 234)) | (1L << (ASIN - 234)) | (1L << (ATAN - 234)) | (1L << (CEIL - 234)) | (1L << (COS - 234)) | (1L << (COT - 234)) | (1L << (EXP - 234)) | (1L << (FLOOR - 234)) | (1L << (LN - 234)) | (1L << (POW - 234)) | (1L << (RAND - 234)) | (1L << (ROUND - 234)) | (1L << (SIN - 234)) | (1L << (SQRT - 234)) | (1L << (TAN - 234)))) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_char_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !(((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (LCASE - 250)) | (1L << (LOWER - 250)) | (1L << (LTRIM - 250)) | (1L << (RTRIM - 250)) | (1L << (CONCAT - 250)) | (1L << (SUBSTR - 250)) | (1L << (TRIM - 250)) | (1L << (UCASE - 250)) | (1L << (UPPER - 250)) | (1L << (TO_CHAR - 250)) | (1L << (LENGTH - 250)) | (1L << (REVERSE - 250)))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_time_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !(((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (TO_DATE - 260)) | (1L << (DAY - 260)) | (1L << (HOUR - 260)) | (1L << (MINUTE - 260)) | (1L << (MONTH - 260)) | (1L << (SECOND - 260)) | (1L << (FROM_UNIXTIME - 260)) | (1L << (YEAR - 260)) | (1L << (DATE_ADD - 260)) | (1L << (DATE_SUB - 260)) | (1L << (DATE_FORMAT - 260)))) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_other_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
		enterRule(_localctx, 34, RULE_group_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (AVG - 271)) | (1L << (COUNT - 271)) | (1L << (MAX - 271)) | (1L << (MIN - 271)) | (1L << (SUM - 271)))) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
		enterRule(_localctx, 38, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		enterRule(_localctx, 40, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		enterRule(_localctx, 42, RULE_engine_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
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
		enterRule(_localctx, 44, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
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
		enterRule(_localctx, 46, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		enterRule(_localctx, 48, RULE_parser_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
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
		enterRule(_localctx, 50, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
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
		enterRule(_localctx, 52, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
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
		enterRule(_localctx, 54, RULE_partition_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
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
		enterRule(_localctx, 56, RULE_constraintbol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		enterRule(_localctx, 58, RULE_foreign_keybol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		enterRule(_localctx, 60, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
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
		enterRule(_localctx, 62, RULE_event_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
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
		enterRule(_localctx, 64, RULE_user_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
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
		enterRule(_localctx, 66, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 68, RULE_procedure_name);
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
		enterRule(_localctx, 70, RULE_server_name);
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
		enterRule(_localctx, 72, RULE_wrapper_name);
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
		enterRule(_localctx, 74, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(428);
				match(AS);
				}
				break;
			}
			setState(431);
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
		enterRule(_localctx, 76, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 78, RULE_server_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		enterRule(_localctx, 80, RULE_role_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
		enterRule(_localctx, 82, RULE_group_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		enterRule(_localctx, 84, RULE_principal_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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
		enterRule(_localctx, 86, RULE_any_name);
		try {
			setState(447);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				string_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
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
		enterRule(_localctx, 88, RULE_priv_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
		enterRule(_localctx, 90, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			exp_factor1();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(452);
				match(OR);
				setState(453);
				exp_factor1();
				}
				}
				setState(458);
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
		enterRule(_localctx, 92, RULE_exp_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			exp_factor2();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(460);
				match(XOR);
				setState(461);
				exp_factor2();
				}
				}
				setState(466);
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
		enterRule(_localctx, 94, RULE_exp_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			exp_factor3();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(468);
				match(AND);
				setState(469);
				exp_factor3();
				}
				}
				setState(474);
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
		enterRule(_localctx, 96, RULE_exp_factor3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(475);
				match(NOT);
				}
				break;
			}
			setState(478);
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
		enterRule(_localctx, 98, RULE_exp_factor4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			bool_primary();
			setState(489);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(481);
				match(IS);
				setState(483);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(482);
					match(NOT);
					}
				}

				setState(487);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
					{
					setState(485);
					boolean_literal();
					}
					break;
				case NULL:
					{
					setState(486);
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
		enterRule(_localctx, 100, RULE_bool_primary);
		int _la;
		try {
			setState(508);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(491);
				predicate();
				setState(492);
				relational_op();
				setState(493);
				predicate();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(495);
				predicate();
				setState(496);
				relational_op();
				setState(498);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(497);
					match(ALL);
					}
				}

				setState(500);
				subquery();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(503);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(502);
					match(NOT);
					}
				}

				setState(505);
				match(EXISTS);
				setState(506);
				subquery();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
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
		enterRule(_localctx, 102, RULE_predicate);
		int _la;
		try {
			setState(543);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(510);
				bit_expr();
				setState(512);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(511);
					match(NOT);
					}
				}

				setState(514);
				match(IN);
				setState(517);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(515);
					subquery();
					}
					break;
				case 2:
					{
					setState(516);
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
				setState(519);
				bit_expr();
				setState(521);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(520);
					match(NOT);
					}
				}

				setState(523);
				match(BETWEEN);
				setState(524);
				bit_expr();
				setState(525);
				match(AND);
				setState(526);
				predicate();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(528);
				bit_expr();
				setState(530);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(529);
					match(NOT);
					}
				}

				setState(532);
				match(LIKE);
				setState(533);
				simple_expr();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(535);
				bit_expr();
				setState(537);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(536);
					match(NOT);
					}
				}

				setState(539);
				match(REGEXP);
				setState(540);
				bit_expr();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(542);
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
		enterRule(_localctx, 104, RULE_bit_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			factor1();
			setState(548);
			_la = _input.LA(1);
			if (_la==VERTBAR) {
				{
				setState(546);
				match(VERTBAR);
				setState(547);
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
		enterRule(_localctx, 106, RULE_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			factor2();
			setState(553);
			_la = _input.LA(1);
			if (_la==BITAND) {
				{
				setState(551);
				match(BITAND);
				setState(552);
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
		enterRule(_localctx, 108, RULE_factor2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			factor3();
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(556);
				_la = _input.LA(1);
				if ( !(_la==SHIFT_LEFT || _la==SHIFT_RIGHT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(557);
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
		enterRule(_localctx, 110, RULE_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			factor4();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(561);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(562);
				factor4();
				}
				}
				setState(567);
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
		enterRule(_localctx, 112, RULE_factor4);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			factor5();
			setState(573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(569);
					_la = _input.LA(1);
					if ( !(((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (DIVIDE - 294)) | (1L << (MOD - 294)) | (1L << (ASTERISK - 294)) | (1L << (POWER_OP - 294)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(570);
					factor5();
					}
					} 
				}
				setState(575);
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
		enterRule(_localctx, 114, RULE_factor5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			factor6();
			setState(579);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(577);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(578);
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
		enterRule(_localctx, 116, RULE_factor6);
		int _la;
		try {
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				_la = _input.LA(1);
				if ( !(_la==BINARY || ((((_la - 316)) & ~0x3f) == 0 && ((1L << (_la - 316)) & ((1L << (PLUS - 316)) | (1L << (MINUS - 316)) | (1L << (NEGATION - 316)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(582);
				simple_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
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
		enterRule(_localctx, 118, RULE_factor7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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
		enterRule(_localctx, 120, RULE_simple_expr);
		try {
			setState(597);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				literal_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				column_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				expression_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				raw_expression_list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(593);
				subquery();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(594);
				match(EXISTS);
				setState(595);
				subquery();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(596);
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
		public Bit_exprContext bit_expr() {
			return getRuleContext(Bit_exprContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(uniformSQLParser.ASTERISK, 0); }
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
		enterRule(_localctx, 122, RULE_function_call);
		int _la;
		try {
			setState(629);
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
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(599);
				functionList();
				setState(612);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(600);
					match(LPAREN);
					setState(609);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ALL) | (1L << NOT) | (1L << LIKE) | (1L << IF) | (1L << EXISTS) | (1L << ASC) | (1L << DESC) | (1L << ORDER) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << WHERE) | (1L << FROM) | (1L << AS) | (1L << SELECT) | (1L << DISTINCT) | (1L << INSERT) | (1L << OVERWRITE) | (1L << OUTER) | (1L << UNIQUEJOIN) | (1L << PRESERVE) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL) | (1L << ON) | (1L << PARTITION) | (1L << PARTITIONS) | (1L << TABLE) | (1L << TABLES) | (1L << COLUMNS) | (1L << INDEX) | (1L << INDEXES) | (1L << REBUILD) | (1L << FUNCTIONS) | (1L << SHOW) | (1L << MSCK) | (1L << REPAIR) | (1L << DIRECTORY) | (1L << LOCAL) | (1L << TRANSFORM) | (1L << USING) | (1L << CLUSTER) | (1L << DISTRIBUTE) | (1L << SORT) | (1L << UNION) | (1L << LOAD) | (1L << EXPORT) | (1L << IMPORT) | (1L << DATA) | (1L << INPATH) | (1L << IS) | (1L << NULL) | (1L << CREATE) | (1L << EXTERNAL) | (1L << ALTER) | (1L << CHANGE) | (1L << COLUMN) | (1L << FIRST) | (1L << AFTER) | (1L << DESCRIBE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DROP - 64)) | (1L << (RENAME - 64)) | (1L << (IGNORE - 64)) | (1L << (PROTECTION - 64)) | (1L << (TO - 64)) | (1L << (COMMENT - 64)) | (1L << (BOOLEAN - 64)) | (1L << (TINYINT - 64)) | (1L << (SMALLINT - 64)) | (1L << (INT - 64)) | (1L << (BIGINT - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (DATE - 64)) | (1L << (DATETIME - 64)) | (1L << (TIMESTAMP - 64)) | (1L << (DECIMAL - 64)) | (1L << (STRING - 64)) | (1L << (VARCHAR - 64)) | (1L << (ARRAY - 64)) | (1L << (STRUCT - 64)) | (1L << (MAP - 64)) | (1L << (UNIONTYPE - 64)) | (1L << (REDUCE - 64)) | (1L << (PARTITIONED - 64)) | (1L << (CLUSTERED - 64)) | (1L << (SORTED - 64)) | (1L << (INTO - 64)) | (1L << (BUCKETS - 64)) | (1L << (ROW - 64)) | (1L << (ROWS - 64)) | (1L << (FORMAT - 64)) | (1L << (DELIMITED - 64)) | (1L << (FIELDS - 64)) | (1L << (TERMINATED - 64)) | (1L << (ESCAPED - 64)) | (1L << (COLLECTION - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (KEY - 64)) | (1L << (LINES - 64)) | (1L << (STORED - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (SEQUENCEFILE - 64)) | (1L << (TEXTFILE - 64)) | (1L << (RCFILE - 64)) | (1L << (ORCFILE - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (OUTPUTFORMAT - 64)) | (1L << (INPUTDRIVER - 64)) | (1L << (OUTPUTDRIVER - 64)) | (1L << (OFFLINE - 64)) | (1L << (ENABLE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DISABLE - 64)) | (1L << (READONLY - 64)) | (1L << (LOCATION - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (BUCKET - 64)) | (1L << (OUT - 64)) | (1L << (OF - 64)) | (1L << (PERCENT - 64)) | (1L << (CAST - 64)) | (1L << (ADD - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (REPLACE - 128)) | (1L << (RLIKE - 128)) | (1L << (REGEXP - 128)) | (1L << (TEMPORARY - 128)) | (1L << (FUNCTION - 128)) | (1L << (MACRO - 128)) | (1L << (EXPLAIN - 128)) | (1L << (EXTENDED - 128)) | (1L << (FORMATTED - 128)) | (1L << (PRETTY - 128)) | (1L << (DEPENDENCY - 128)) | (1L << (LOGICAL - 128)) | (1L << (SERDE - 128)) | (1L << (WITH - 128)) | (1L << (DEFERRED - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (LIMIT - 128)) | (1L << (SET - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (IDXPROPERTIES - 128)) | (1L << (CASCADED - 128)) | (1L << (CASE - 128)) | (1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (END - 128)) | (1L << (MAPJOIN - 128)) | (1L << (STREAMTABLE - 128)) | (1L << (CLUSTERSTATUS - 128)) | (1L << (UTC - 128)) | (1L << (LONG - 128)) | (1L << (DELETE - 128)) | (1L << (FETCH - 128)) | (1L << (INTERSECT - 128)) | (1L << (VIEW - 128)) | (1L << (IN - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (GRANT - 128)) | (1L << (REVOKE - 128)) | (1L << (SSL - 128)) | (1L << (UNDO - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (UNLOCK - 128)) | (1L << (SHARED - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (PROCEDURE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (WHILE - 128)) | (1L << (READ - 128)) | (1L << (READS - 128)) | (1L << (PURGE - 128)) | (1L << (RANGE - 128)) | (1L << (ANALYZE - 128)) | (1L << (BEFORE - 128)) | (1L << (BETWEEN - 128)) | (1L << (BOTH - 128)) | (1L << (BINARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (CROSS - 192)) | (1L << (CONTINUE - 192)) | (1L << (CURSOR - 192)) | (1L << (TRIGGER - 192)) | (1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (LATERAL - 192)) | (1L << (TOUCH - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (COMPUTE - 192)) | (1L << (STATISTICS - 192)) | (1L << (USE - 192)) | (1L << (OPTION - 192)) | (1L << (CONCATENATE - 192)) | (1L << (UPDATE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CASCADE - 192)) | (1L << (SKEWED - 192)) | (1L << (ROLLUP - 192)) | (1L << (CUBE - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (FOR - 192)) | (1L << (WINDOW - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (PRECEDING - 192)) | (1L << (FOLLOWING - 192)) | (1L << (CURRENT - 192)) | (1L << (LESS - 192)) | (1L << (MORE - 192)) | (1L << (OVER - 192)) | (1L << (GROUPING - 192)) | (1L << (SETS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (NOSCAN - 192)) | (1L << (PARTIALSCAN - 192)) | (1L << (USER - 192)) | (1L << (ROLE - 192)) | (1L << (INNER - 192)) | (1L << (EXCHANGE - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (CHAR - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ASIN - 192)) | (1L << (ATAN - 192)) | (1L << (CEIL - 192)) | (1L << (COS - 192)) | (1L << (COT - 192)) | (1L << (EXP - 192)) | (1L << (FLOOR - 192)) | (1L << (LN - 192)) | (1L << (POW - 192)) | (1L << (RAND - 192)) | (1L << (ROUND - 192)) | (1L << (SIN - 192)) | (1L << (SQRT - 192)) | (1L << (TAN - 192)) | (1L << (LCASE - 192)) | (1L << (LOWER - 192)) | (1L << (LTRIM - 192)) | (1L << (RTRIM - 192)) | (1L << (CONCAT - 192)) | (1L << (SUBSTR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRIM - 256)) | (1L << (UCASE - 256)) | (1L << (UPPER - 256)) | (1L << (INTERVAL - 256)) | (1L << (TO_DATE - 256)) | (1L << (DAY - 256)) | (1L << (HOUR - 256)) | (1L << (MINUTE - 256)) | (1L << (MONTH - 256)) | (1L << (SECOND - 256)) | (1L << (FROM_UNIXTIME - 256)) | (1L << (YEAR - 256)) | (1L << (DATE_ADD - 256)) | (1L << (DATE_SUB - 256)) | (1L << (COLLATE - 256)) | (1L << (AVG - 256)) | (1L << (COUNT - 256)) | (1L << (MAX - 256)) | (1L << (MIN - 256)) | (1L << (SUM - 256)) | (1L << (COALESCE - 256)) | (1L << (DUPLICATE - 256)) | (1L << (SERVER - 256)) | (1L << (ALIASES - 256)) | (1L << (ALIAS - 256)) | (1L << (VALUES - 256)) | (1L << (VALUE - 256)) | (1L << (LOW_PRIORITY - 256)) | (1L << (HIGH_PRIORITY - 256)) | (1L << (HASH - 256)) | (1L << (REFERENCES - 256)) | (1L << (TO_CHAR - 256)) | (1L << (DATE_FORMAT - 256)) | (1L << (SIGNED - 256)) | (1L << (INTEGER - 256)) | (1L << (LENGTH - 256)) | (1L << (REVERSE - 256)) | (1L << (IFNULL - 256)) | (1L << (DIVIDE - 256)) | (1L << (MOD - 256)) | (1L << (OR - 256)) | (1L << (AND - 256)) | (1L << (XOR - 256)) | (1L << (ARROW - 256)) | (1L << (EQ - 256)) | (1L << (NOT_EQ - 256)) | (1L << (LET - 256)) | (1L << (GET - 256)) | (1L << (SET_VAR - 256)) | (1L << (SHIFT_LEFT - 256)) | (1L << (SHIFT_RIGHT - 256)) | (1L << (LPAREN - 256)) | (1L << (PLUS - 256)) | (1L << (MINUS - 256)) | (1L << (NEGATION - 256)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (INTEGER_NUM - 325)) | (1L << (HEX_DIGIT - 325)) | (1L << (BIT_NUM - 325)) | (1L << (REAL_NUMBER - 325)) | (1L << (TEXT_STRING - 325)) | (1L << (ID - 325)))) != 0)) {
						{
						setState(601);
						expression();
						setState(606);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(602);
							match(COMMA);
							setState(603);
							expression();
							}
							}
							setState(608);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(611);
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
				setState(614);
				match(CAST);
				setState(615);
				match(LPAREN);
				setState(616);
				expression();
				setState(617);
				match(AS);
				setState(618);
				cast_data_type();
				setState(619);
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
				setState(621);
				group_functions();
				setState(622);
				match(LPAREN);
				setState(624);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(623);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==ASTERISK) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(626);
				bit_expr();
				setState(627);
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
		enterRule(_localctx, 124, RULE_case_when_statement);
		try {
			setState(633);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				case_when_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
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
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
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
		enterRule(_localctx, 126, RULE_case_when_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(CASE);
			setState(641); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(636);
				match(WHEN);
				setState(637);
				expression();
				setState(638);
				match(THEN);
				setState(639);
				bit_expr();
				}
				}
				setState(643); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(647);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(645);
				match(ELSE);
				setState(646);
				bit_expr();
				}
			}

			setState(649);
			match(END);
			setState(650);
			alias();
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
		enterRule(_localctx, 128, RULE_case_when_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(CASE);
			setState(653);
			bit_expr();
			setState(659); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(654);
				match(WHEN);
				setState(655);
				bit_expr();
				setState(656);
				match(THEN);
				setState(657);
				bit_expr();
				}
				}
				setState(661); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(665);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(663);
				match(ELSE);
				setState(664);
				bit_expr();
				}
			}

			setState(667);
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
		enterRule(_localctx, 130, RULE_column_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(669);
				table_spec();
				setState(670);
				match(DOT);
				}
				break;
			}
			setState(674);
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
		enterRule(_localctx, 132, RULE_raw_expression_list);
		try {
			int _alt;
			setState(690);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
						match(OR);
						setState(678);
						column_spec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(681); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				column_name();
				setState(686); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(684);
						match(AND);
						setState(685);
						column_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(688); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 134, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(LPAREN);
			setState(693);
			expression();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(694);
				match(COMMA);
				setState(695);
				expression();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
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
		enterRule(_localctx, 136, RULE_interval_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(INTERVAL);
			setState(704);
			expression();
			setState(705);
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
		enterRule(_localctx, 138, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			table_reference();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(708);
				match(COMMA);
				setState(709);
				table_reference();
				}
				}
				setState(714);
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
		enterRule(_localctx, 140, RULE_table_reference);
		try {
			setState(717);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				table_factor1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
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
		public List<TerminalNode> CROSS() { return getTokens(uniformSQLParser.CROSS); }
		public TerminalNode CROSS(int i) {
			return getToken(uniformSQLParser.CROSS, i);
		}
		public List<TerminalNode> OUTER() { return getTokens(uniformSQLParser.OUTER); }
		public TerminalNode OUTER(int i) {
			return getToken(uniformSQLParser.OUTER, i);
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
		enterRule(_localctx, 142, RULE_table_factor1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			table_factor2();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTER) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0) || _la==CROSS) {
				{
				{
				setState(721);
				_la = _input.LA(1);
				if (_la==CROSS) {
					{
					setState(720);
					match(CROSS);
					}
				}

				setState(724);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
					{
					setState(723);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(727);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(726);
					match(OUTER);
					}
				}

				setState(729);
				match(JOIN);
				setState(730);
				table_atom();
				setState(732);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(731);
					join_condition();
					}
					break;
				}
				}
				}
				setState(738);
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
		enterRule(_localctx, 144, RULE_table_factor2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			table_factor3();
			setState(750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(740);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(742);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(741);
						match(OUTER);
						}
					}

					setState(744);
					match(JOIN);
					setState(745);
					table_factor3();
					setState(746);
					join_condition();
					}
					} 
				}
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
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
		enterRule(_localctx, 146, RULE_table_factor3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			table_atom();
			setState(755);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(754);
				alias();
				}
				break;
			}
			setState(765);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(761);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) {
					{
					setState(757);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FULL))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(759);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(758);
						match(OUTER);
						}
					}

					}
				}

				setState(763);
				match(JOIN);
				setState(764);
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
		enterRule(_localctx, 148, RULE_table_atom);
		try {
			setState(780);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(767);
				table_spec();
				setState(769);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(768);
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
				setState(771);
				subquery();
				setState(773);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(772);
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
				setState(775);
				match(LPAREN);
				setState(776);
				table_references();
				setState(777);
				match(RPAREN);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(779);
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
		enterRule(_localctx, 150, RULE_join_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(ON);
			setState(783);
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
		enterRule(_localctx, 152, RULE_index_hint_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			index_hint();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(786);
				match(COMMA);
				setState(787);
				index_hint();
				}
				}
				setState(792);
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
		enterRule(_localctx, 154, RULE_index_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(802);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(794);
				match(FOR);
				setState(800);
				switch (_input.LA(1)) {
				case JOIN:
					{
					{
					setState(795);
					match(JOIN);
					}
					}
					break;
				case ORDER:
					{
					{
					setState(796);
					match(ORDER);
					setState(797);
					match(BY);
					}
					}
					break;
				case GROUP:
					{
					{
					setState(798);
					match(GROUP);
					setState(799);
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
		enterRule(_localctx, 156, RULE_index_hint);
		int _la;
		try {
			setState(818);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(USE);
				setState(805);
				index_options();
				setState(806);
				match(LPAREN);
				setState(808);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ALL) | (1L << NOT) | (1L << LIKE) | (1L << IF) | (1L << EXISTS) | (1L << ASC) | (1L << DESC) | (1L << ORDER) | (1L << GROUP) | (1L << BY) | (1L << HAVING) | (1L << WHERE) | (1L << FROM) | (1L << AS) | (1L << SELECT) | (1L << DISTINCT) | (1L << INSERT) | (1L << OVERWRITE) | (1L << OUTER) | (1L << UNIQUEJOIN) | (1L << PRESERVE) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL) | (1L << ON) | (1L << PARTITION) | (1L << PARTITIONS) | (1L << TABLE) | (1L << TABLES) | (1L << COLUMNS) | (1L << INDEX) | (1L << INDEXES) | (1L << REBUILD) | (1L << FUNCTIONS) | (1L << SHOW) | (1L << MSCK) | (1L << REPAIR) | (1L << DIRECTORY) | (1L << LOCAL) | (1L << TRANSFORM) | (1L << USING) | (1L << CLUSTER) | (1L << DISTRIBUTE) | (1L << SORT) | (1L << UNION) | (1L << LOAD) | (1L << EXPORT) | (1L << IMPORT) | (1L << DATA) | (1L << INPATH) | (1L << IS) | (1L << NULL) | (1L << CREATE) | (1L << EXTERNAL) | (1L << ALTER) | (1L << CHANGE) | (1L << COLUMN) | (1L << FIRST) | (1L << AFTER) | (1L << DESCRIBE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DROP - 64)) | (1L << (RENAME - 64)) | (1L << (IGNORE - 64)) | (1L << (PROTECTION - 64)) | (1L << (TO - 64)) | (1L << (COMMENT - 64)) | (1L << (BOOLEAN - 64)) | (1L << (TINYINT - 64)) | (1L << (SMALLINT - 64)) | (1L << (INT - 64)) | (1L << (BIGINT - 64)) | (1L << (FLOAT - 64)) | (1L << (DOUBLE - 64)) | (1L << (DATE - 64)) | (1L << (DATETIME - 64)) | (1L << (TIMESTAMP - 64)) | (1L << (DECIMAL - 64)) | (1L << (STRING - 64)) | (1L << (VARCHAR - 64)) | (1L << (ARRAY - 64)) | (1L << (STRUCT - 64)) | (1L << (MAP - 64)) | (1L << (UNIONTYPE - 64)) | (1L << (REDUCE - 64)) | (1L << (PARTITIONED - 64)) | (1L << (CLUSTERED - 64)) | (1L << (SORTED - 64)) | (1L << (INTO - 64)) | (1L << (BUCKETS - 64)) | (1L << (ROW - 64)) | (1L << (ROWS - 64)) | (1L << (FORMAT - 64)) | (1L << (DELIMITED - 64)) | (1L << (FIELDS - 64)) | (1L << (TERMINATED - 64)) | (1L << (ESCAPED - 64)) | (1L << (COLLECTION - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)) | (1L << (KEY - 64)) | (1L << (LINES - 64)) | (1L << (STORED - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (SEQUENCEFILE - 64)) | (1L << (TEXTFILE - 64)) | (1L << (RCFILE - 64)) | (1L << (ORCFILE - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (OUTPUTFORMAT - 64)) | (1L << (INPUTDRIVER - 64)) | (1L << (OUTPUTDRIVER - 64)) | (1L << (OFFLINE - 64)) | (1L << (ENABLE - 64)) | (1L << (DEFAULT - 64)) | (1L << (DISABLE - 64)) | (1L << (READONLY - 64)) | (1L << (LOCATION - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (BUCKET - 64)) | (1L << (OUT - 64)) | (1L << (OF - 64)) | (1L << (PERCENT - 64)) | (1L << (CAST - 64)) | (1L << (ADD - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (REPLACE - 128)) | (1L << (RLIKE - 128)) | (1L << (REGEXP - 128)) | (1L << (TEMPORARY - 128)) | (1L << (FUNCTION - 128)) | (1L << (MACRO - 128)) | (1L << (EXPLAIN - 128)) | (1L << (EXTENDED - 128)) | (1L << (FORMATTED - 128)) | (1L << (PRETTY - 128)) | (1L << (DEPENDENCY - 128)) | (1L << (LOGICAL - 128)) | (1L << (SERDE - 128)) | (1L << (WITH - 128)) | (1L << (DEFERRED - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (LIMIT - 128)) | (1L << (SET - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (IDXPROPERTIES - 128)) | (1L << (CASCADED - 128)) | (1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (END - 128)) | (1L << (MAPJOIN - 128)) | (1L << (STREAMTABLE - 128)) | (1L << (CLUSTERSTATUS - 128)) | (1L << (UTC - 128)) | (1L << (LONG - 128)) | (1L << (DELETE - 128)) | (1L << (FETCH - 128)) | (1L << (INTERSECT - 128)) | (1L << (VIEW - 128)) | (1L << (IN - 128)) | (1L << (DATABASE - 128)) | (1L << (DATABASES - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (GRANT - 128)) | (1L << (REVOKE - 128)) | (1L << (SSL - 128)) | (1L << (UNDO - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (UNLOCK - 128)) | (1L << (SHARED - 128)) | (1L << (EXCLUSIVE - 128)) | (1L << (PROCEDURE - 128)) | (1L << (UNSIGNED - 128)) | (1L << (WHILE - 128)) | (1L << (READ - 128)) | (1L << (READS - 128)) | (1L << (PURGE - 128)) | (1L << (RANGE - 128)) | (1L << (ANALYZE - 128)) | (1L << (BEFORE - 128)) | (1L << (BETWEEN - 128)) | (1L << (BOTH - 128)) | (1L << (BINARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (CROSS - 192)) | (1L << (CONTINUE - 192)) | (1L << (CURSOR - 192)) | (1L << (TRIGGER - 192)) | (1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (LATERAL - 192)) | (1L << (TOUCH - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (COMPUTE - 192)) | (1L << (STATISTICS - 192)) | (1L << (USE - 192)) | (1L << (OPTION - 192)) | (1L << (CONCATENATE - 192)) | (1L << (UPDATE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CASCADE - 192)) | (1L << (SKEWED - 192)) | (1L << (ROLLUP - 192)) | (1L << (CUBE - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (FOR - 192)) | (1L << (WINDOW - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (PRECEDING - 192)) | (1L << (FOLLOWING - 192)) | (1L << (CURRENT - 192)) | (1L << (LESS - 192)) | (1L << (MORE - 192)) | (1L << (OVER - 192)) | (1L << (GROUPING - 192)) | (1L << (SETS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (NOSCAN - 192)) | (1L << (PARTIALSCAN - 192)) | (1L << (USER - 192)) | (1L << (ROLE - 192)) | (1L << (INNER - 192)) | (1L << (EXCHANGE - 192)) | (1L << (IDENTIFIED - 192)) | (1L << (CHAR - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ASIN - 192)) | (1L << (ATAN - 192)) | (1L << (CEIL - 192)) | (1L << (COS - 192)) | (1L << (COT - 192)) | (1L << (EXP - 192)) | (1L << (FLOOR - 192)) | (1L << (LN - 192)) | (1L << (POW - 192)) | (1L << (RAND - 192)) | (1L << (ROUND - 192)) | (1L << (SIN - 192)) | (1L << (SQRT - 192)) | (1L << (TAN - 192)) | (1L << (LCASE - 192)) | (1L << (LOWER - 192)) | (1L << (LTRIM - 192)) | (1L << (RTRIM - 192)) | (1L << (CONCAT - 192)) | (1L << (SUBSTR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRIM - 256)) | (1L << (UCASE - 256)) | (1L << (UPPER - 256)) | (1L << (INTERVAL - 256)) | (1L << (TO_DATE - 256)) | (1L << (DAY - 256)) | (1L << (HOUR - 256)) | (1L << (MINUTE - 256)) | (1L << (MONTH - 256)) | (1L << (SECOND - 256)) | (1L << (FROM_UNIXTIME - 256)) | (1L << (YEAR - 256)) | (1L << (DATE_ADD - 256)) | (1L << (DATE_SUB - 256)) | (1L << (COLLATE - 256)) | (1L << (AVG - 256)) | (1L << (COUNT - 256)) | (1L << (MAX - 256)) | (1L << (MIN - 256)) | (1L << (SUM - 256)) | (1L << (COALESCE - 256)) | (1L << (DUPLICATE - 256)) | (1L << (SERVER - 256)) | (1L << (ALIASES - 256)) | (1L << (ALIAS - 256)) | (1L << (VALUES - 256)) | (1L << (VALUE - 256)) | (1L << (LOW_PRIORITY - 256)) | (1L << (HIGH_PRIORITY - 256)) | (1L << (HASH - 256)) | (1L << (REFERENCES - 256)) | (1L << (TO_CHAR - 256)) | (1L << (DATE_FORMAT - 256)) | (1L << (SIGNED - 256)) | (1L << (INTEGER - 256)) | (1L << (LENGTH - 256)) | (1L << (REVERSE - 256)) | (1L << (IFNULL - 256)) | (1L << (DIVIDE - 256)) | (1L << (MOD - 256)) | (1L << (OR - 256)) | (1L << (AND - 256)) | (1L << (XOR - 256)) | (1L << (ARROW - 256)) | (1L << (EQ - 256)) | (1L << (NOT_EQ - 256)) | (1L << (LET - 256)) | (1L << (GET - 256)) | (1L << (SET_VAR - 256)) | (1L << (SHIFT_LEFT - 256)) | (1L << (SHIFT_RIGHT - 256)))) != 0) || _la==TEXT_STRING || _la==ID) {
					{
					setState(807);
					index_list();
					}
				}

				setState(810);
				match(RPAREN);
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				match(IGNORE);
				setState(813);
				index_options();
				setState(814);
				match(LPAREN);
				setState(815);
				index_list();
				setState(816);
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
		enterRule(_localctx, 158, RULE_index_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			index_name();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(821);
				match(COMMA);
				setState(822);
				index_name();
				}
				}
				setState(827);
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
		enterRule(_localctx, 160, RULE_partition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(PARTITION);
			setState(829);
			match(LPAREN);
			setState(830);
			partition_names();
			setState(831);
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
		enterRule(_localctx, 162, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			partition_name();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(834);
				match(COMMA);
				setState(835);
				partition_name();
				}
				}
				setState(840);
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
		enterRule(_localctx, 164, RULE_root_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			switch (_input.LA(1)) {
			case SELECT:
			case INSERT:
			case DELETE:
			case UPDATE:
			case SERVER:
				{
				setState(841);
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
				setState(842);
				data_definition_statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(846);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(845);
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
		public Delete_statementsContext delete_statements() {
			return getRuleContext(Delete_statementsContext.class,0);
		}
		public Insert_statementsContext insert_statements() {
			return getRuleContext(Insert_statementsContext.class,0);
		}
		public Update_statementsContext update_statements() {
			return getRuleContext(Update_statementsContext.class,0);
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
		enterRule(_localctx, 166, RULE_data_manipulation_statements);
		try {
			setState(853);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				select_statement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				delete_statements();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
				insert_statements();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(851);
				update_statements();
				}
				break;
			case SERVER:
				enterOuterAlt(_localctx, 5);
				{
				setState(852);
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
		public Create_database_statementContext create_database_statement() {
			return getRuleContext(Create_database_statementContext.class,0);
		}
		public Drop_database_statementContext drop_database_statement() {
			return getRuleContext(Drop_database_statementContext.class,0);
		}
		public Create_user_statementContext create_user_statement() {
			return getRuleContext(Create_user_statementContext.class,0);
		}
		public Drop_user_statementContext drop_user_statement() {
			return getRuleContext(Drop_user_statementContext.class,0);
		}
		public Grant_privilege_statementContext grant_privilege_statement() {
			return getRuleContext(Grant_privilege_statementContext.class,0);
		}
		public Revoke_privilege_statementContext revoke_privilege_statement() {
			return getRuleContext(Revoke_privilege_statementContext.class,0);
		}
		public Show_event_statementContext show_event_statement() {
			return getRuleContext(Show_event_statementContext.class,0);
		}
		public Set_event_statementContext set_event_statement() {
			return getRuleContext(Set_event_statementContext.class,0);
		}
		public Create_table_statementContext create_table_statement() {
			return getRuleContext(Create_table_statementContext.class,0);
		}
		public Alter_table_statementContext alter_table_statement() {
			return getRuleContext(Alter_table_statementContext.class,0);
		}
		public Drop_table_statementContext drop_table_statement() {
			return getRuleContext(Drop_table_statementContext.class,0);
		}
		public Drop_view_statementContext drop_view_statement() {
			return getRuleContext(Drop_view_statementContext.class,0);
		}
		public Create_view_statementContext create_view_statement() {
			return getRuleContext(Create_view_statementContext.class,0);
		}
		public Alter_view_statementContext alter_view_statement() {
			return getRuleContext(Alter_view_statementContext.class,0);
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
		enterRule(_localctx, 168, RULE_data_definition_statements);
		try {
			setState(870);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				create_database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				drop_database_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
				create_user_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(858);
				drop_user_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(859);
				grant_privilege_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(860);
				revoke_privilege_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(861);
				show_event_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(862);
				set_event_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(863);
				create_table_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(864);
				alter_table_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(865);
				drop_table_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(866);
				drop_view_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(867);
				create_view_statement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(868);
				alter_view_statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(869);
				use_event_statement();
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
		enterRule(_localctx, 170, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			select_expression();
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(873);
				match(UNION);
				setState(875);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(874);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(877);
				select_expression();
				}
				}
				setState(882);
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
		enterRule(_localctx, 172, RULE_select_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(SELECT);
			setState(885);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(884);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(887);
			select_list();
			setState(899);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(888);
				match(FROM);
				setState(889);
				table_references();
				setState(891);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(890);
					where_clause();
					}
				}

				setState(894);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(893);
					groupby_clause();
					}
				}

				setState(897);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(896);
					having_clause();
					}
				}

				}
			}

			setState(902);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(901);
				orderby_clause();
				}
			}

			setState(905);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(904);
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
		enterRule(_localctx, 174, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(WHERE);
			setState(908);
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
		public TerminalNode WITH() { return getToken(uniformSQLParser.WITH, 0); }
		public TerminalNode ROLLUP() { return getToken(uniformSQLParser.ROLLUP, 0); }
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
		enterRule(_localctx, 176, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(GROUP);
			setState(911);
			match(BY);
			setState(912);
			groupby_item();
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(913);
				match(COMMA);
				setState(914);
				groupby_item();
				}
				}
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(922);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(920);
				match(WITH);
				setState(921);
				match(ROLLUP);
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
		enterRule(_localctx, 178, RULE_groupby_item);
		try {
			setState(927);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				column_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				match(INTEGER_NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
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
		enterRule(_localctx, 180, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(HAVING);
			setState(930);
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
		enterRule(_localctx, 182, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(ORDER);
			setState(933);
			match(BY);
			setState(934);
			orderby_item();
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(935);
				match(COMMA);
				setState(936);
				orderby_item();
				}
				}
				setState(941);
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
		enterRule(_localctx, 184, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			groupby_item();
			setState(944);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(943);
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
		enterRule(_localctx, 186, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(LIMIT);
			{
			setState(950);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(947);
				offset();
				setState(948);
				match(COMMA);
				}
				break;
			}
			setState(952);
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
		enterRule(_localctx, 188, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
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
		enterRule(_localctx, 190, RULE_row_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
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
		enterRule(_localctx, 192, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			displayed_column();
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(959);
				match(COMMA);
				setState(960);
				displayed_column();
				}
				}
				setState(965);
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
		enterRule(_localctx, 194, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(LPAREN);
			setState(967);
			column_spec();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(968);
				match(COMMA);
				setState(969);
				column_spec();
				}
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(975);
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
		enterRule(_localctx, 196, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(LPAREN);
			setState(978);
			select_statement();
			setState(979);
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
		enterRule(_localctx, 198, RULE_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(981);
				schema_name();
				setState(982);
				match(DOT);
				}
				break;
			}
			setState(986);
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
		enterRule(_localctx, 200, RULE_displayed_column);
		try {
			setState(1001);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(988);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				table_spec();
				setState(990);
				match(DOT);
				setState(991);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(993);
				column_spec();
				setState(995);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(994);
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
				setState(997);
				bit_expr();
				setState(999);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(998);
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

	public static class Insert_statementsContext extends ParserRuleContext {
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Insert_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInsert_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_statementsContext insert_statements() throws RecognitionException {
		Insert_statementsContext _localctx = new Insert_statementsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_insert_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			insert_statement();
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
		public TerminalNode IGNORE() { return getToken(uniformSQLParser.IGNORE, 0); }
		public TerminalNode INTO() { return getToken(uniformSQLParser.INTO, 0); }
		public Partition_clauseContext partition_clause() {
			return getRuleContext(Partition_clauseContext.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(uniformSQLParser.LOW_PRIORITY, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(uniformSQLParser.HIGH_PRIORITY, 0); }
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
		enterRule(_localctx, 204, RULE_insert_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(INSERT);
			setState(1007);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(1006);
				_la = _input.LA(1);
				if ( !(_la==LOW_PRIORITY || _la==HIGH_PRIORITY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(1010);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1009);
				match(IGNORE);
				}
				break;
			}
			setState(1013);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1012);
				match(INTO);
				}
				break;
			}
			setState(1015);
			table_spec();
			setState(1017);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1016);
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

	public static class Insert_subfixContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(uniformSQLParser.ON, 0); }
		public TerminalNode DUPLICATE() { return getToken(uniformSQLParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public List<Column_specContext> column_spec() {
			return getRuleContexts(Column_specContext.class);
		}
		public Column_specContext column_spec(int i) {
			return getRuleContext(Column_specContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(uniformSQLParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(uniformSQLParser.EQ, i);
		}
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
		public Insert_subfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_subfix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitInsert_subfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_subfixContext insert_subfix() throws RecognitionException {
		Insert_subfixContext _localctx = new Insert_subfixContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_insert_subfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(ON);
			setState(1020);
			match(DUPLICATE);
			setState(1021);
			match(KEY);
			setState(1022);
			match(UPDATE);
			setState(1023);
			column_spec();
			setState(1024);
			match(EQ);
			setState(1025);
			expression();
			setState(1033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1026);
				match(COMMA);
				setState(1027);
				column_spec();
				setState(1028);
				match(EQ);
				setState(1029);
				expression();
				}
				}
				setState(1035);
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
		public Insert_subfixContext insert_subfix() {
			return getRuleContext(Insert_subfixContext.class,0);
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
		enterRule(_localctx, 208, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			insert_header();
			setState(1038);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1037);
				column_list();
				}
			}

			setState(1042);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1040);
				select_expression();
				}
				break;
			case VALUES:
			case VALUE:
				{
				setState(1041);
				value_list_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1045);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1044);
				insert_subfix();
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
			setState(1047);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1048);
			column_value_list();
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1049);
				match(COMMA);
				setState(1050);
				column_value_list();
				}
				}
				setState(1055);
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
			setState(1056);
			match(LPAREN);
			setState(1059);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1057);
				bit_expr();
				}
				break;
			case 2:
				{
				setState(1058);
				match(DEFAULT);
				}
				break;
			}
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1061);
				match(COMMA);
				setState(1064);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1062);
					bit_expr();
					}
					break;
				case 2:
					{
					setState(1063);
					match(DEFAULT);
					}
					break;
				}
				}
				}
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1071);
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
			setState(1073);
			match(SET);
			setState(1074);
			set_column_cluase();
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1075);
				match(COMMA);
				setState(1076);
				set_column_cluase();
				}
				}
				setState(1081);
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
			setState(1082);
			column_spec();
			setState(1083);
			match(EQ);
			setState(1086);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1084);
				expression();
				}
				break;
			case 2:
				{
				setState(1085);
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
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
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
			setState(1088);
			match(CREATE);
			setState(1089);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1093);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1090);
				match(IF);
				setState(1091);
				match(NOT);
				setState(1092);
				match(EXISTS);
				}
				break;
			}
			setState(1095);
			schema_name();
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
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
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
		enterRule(_localctx, 220, RULE_drop_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(DROP);
			setState(1098);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1101);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1099);
				match(IF);
				setState(1100);
				match(EXISTS);
				}
				break;
			}
			setState(1103);
			schema_name();
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
		public Create_table_statement3Context create_table_statement3() {
			return getRuleContext(Create_table_statement3Context.class,0);
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
		enterRule(_localctx, 222, RULE_create_table_statement);
		try {
			setState(1108);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				create_table_statement1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				create_table_statement2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1107);
				create_table_statement3();
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
		enterRule(_localctx, 224, RULE_create_table_statement1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			match(CREATE);
			setState(1112);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1111);
				match(TEMPORARY);
				}
			}

			setState(1115);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1114);
				match(EXTERNAL);
				}
			}

			setState(1117);
			match(TABLE);
			setState(1121);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1118);
				match(IF);
				setState(1119);
				match(NOT);
				setState(1120);
				match(EXISTS);
				}
				break;
			}
			setState(1123);
			table_spec();
			setState(1135);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1124);
				match(LPAREN);
				setState(1125);
				create_definition();
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1126);
					match(COMMA);
					setState(1127);
					create_definition();
					}
					}
					setState(1132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1133);
				match(RPAREN);
				}
			}

			setState(1139);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1137);
				match(COMMENT);
				setState(1138);
				match(TEXT_STRING);
				}
			}

			setState(1143);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1141);
				match(AS);
				setState(1142);
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
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode AS() { return getToken(uniformSQLParser.AS, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
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
		enterRule(_localctx, 226, RULE_create_table_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(CREATE);
			setState(1147);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1146);
				match(TEMPORARY);
				}
			}

			setState(1150);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1149);
				match(EXTERNAL);
				}
			}

			setState(1152);
			match(TABLE);
			setState(1156);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1153);
				match(IF);
				setState(1154);
				match(NOT);
				setState(1155);
				match(EXISTS);
				}
				break;
			}
			setState(1158);
			table_spec();
			setState(1159);
			match(AS);
			setState(1160);
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

	public static class Create_table_statement3Context extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(uniformSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public List<Table_specContext> table_spec() {
			return getRuleContexts(Table_specContext.class);
		}
		public Table_specContext table_spec(int i) {
			return getRuleContext(Table_specContext.class,i);
		}
		public TerminalNode TEMPORARY() { return getToken(uniformSQLParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(uniformSQLParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(uniformSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(uniformSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(uniformSQLParser.EXISTS, 0); }
		public TerminalNode LIKE() { return getToken(uniformSQLParser.LIKE, 0); }
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public Create_table_statement3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_statement3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitCreate_table_statement3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_statement3Context create_table_statement3() throws RecognitionException {
		Create_table_statement3Context _localctx = new Create_table_statement3Context(_ctx, getState());
		enterRule(_localctx, 228, RULE_create_table_statement3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(CREATE);
			setState(1164);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1163);
				match(TEMPORARY);
				}
			}

			setState(1167);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1166);
				match(EXTERNAL);
				}
			}

			setState(1169);
			match(TABLE);
			setState(1173);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1170);
				match(IF);
				setState(1171);
				match(NOT);
				setState(1172);
				match(EXISTS);
				}
				break;
			}
			setState(1175);
			table_spec();
			setState(1183);
			switch (_input.LA(1)) {
			case LIKE:
				{
				{
				setState(1176);
				match(LIKE);
				setState(1177);
				table_spec();
				}
				}
				break;
			case LPAREN:
				{
				{
				setState(1178);
				match(LPAREN);
				setState(1179);
				match(LIKE);
				setState(1180);
				table_spec();
				setState(1181);
				match(RPAREN);
				}
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

	public static class Create_definitionContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public TerminalNode INDEX() { return getToken(uniformSQLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(uniformSQLParser.KEY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
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
		enterRule(_localctx, 230, RULE_create_definition);
		int _la;
		try {
			setState(1211);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1185);
				column_name();
				setState(1186);
				column_definition();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1188);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1190);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1189);
					index_name();
					}
					break;
				}
				setState(1193);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1192);
					index_type();
					}
				}

				setState(1195);
				match(LPAREN);
				setState(1196);
				index_column_name();
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1197);
					match(COMMA);
					setState(1198);
					index_column_name();
					}
					}
					setState(1203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1204);
				match(RPAREN);
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==USING || _la==COMMENT) {
					{
					{
					setState(1205);
					index_option();
					}
					}
					setState(1210);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Column_definitionContext extends ParserRuleContext {
		public Column_data_type_headerContext column_data_type_header() {
			return getRuleContext(Column_data_type_headerContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(uniformSQLParser.COMMENT, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
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
		enterRule(_localctx, 232, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			column_data_type_header();
			setState(1216);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1214);
				match(COMMENT);
				setState(1215);
				match(TEXT_STRING);
				}
			}

			setState(1219);
			_la = _input.LA(1);
			if (_la==REFERENCES) {
				{
				setState(1218);
				reference_definition();
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
		enterRule(_localctx, 234, RULE_null_or_notnull);
		try {
			setState(1224);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1221);
				match(NOT);
				setState(1222);
				match(NULL);
				}
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223);
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
		public TerminalNode UNSIGNED() { return getToken(uniformSQLParser.UNSIGNED, 0); }
		public Null_or_notnullContext null_or_notnull() {
			return getRuleContext(Null_or_notnullContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(uniformSQLParser.DEFAULT, 0); }
		public List<Number_literalContext> number_literal() {
			return getRuleContexts(Number_literalContext.class);
		}
		public Number_literalContext number_literal(int i) {
			return getRuleContext(Number_literalContext.class,i);
		}
		public TerminalNode SMALLINT() { return getToken(uniformSQLParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(uniformSQLParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(uniformSQLParser.BIGINT, 0); }
		public TerminalNode DOUBLE() { return getToken(uniformSQLParser.DOUBLE, 0); }
		public TerminalNode COMMA() { return getToken(uniformSQLParser.COMMA, 0); }
		public TerminalNode FLOAT() { return getToken(uniformSQLParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(uniformSQLParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(uniformSQLParser.DATE, 0); }
		public TerminalNode TEXT_STRING() { return getToken(uniformSQLParser.TEXT_STRING, 0); }
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
		enterRule(_localctx, 236, RULE_column_data_type_header);
		int _la;
		try {
			setState(1410);
			switch (_input.LA(1)) {
			case TINYINT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1226);
				match(TINYINT);
				setState(1231);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1227);
					match(LPAREN);
					setState(1228);
					length();
					setState(1229);
					match(RPAREN);
					}
				}

				setState(1234);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1233);
					match(UNSIGNED);
					}
				}

				setState(1237);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1236);
					null_or_notnull();
					}
				}

				setState(1241);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1239);
					match(DEFAULT);
					setState(1240);
					number_literal();
					}
				}

				}
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1243);
				match(SMALLINT);
				setState(1248);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1244);
					match(LPAREN);
					setState(1245);
					length();
					setState(1246);
					match(RPAREN);
					}
				}

				setState(1251);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1250);
					match(UNSIGNED);
					}
				}

				setState(1254);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1253);
					null_or_notnull();
					}
				}

				setState(1258);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1256);
					match(DEFAULT);
					setState(1257);
					number_literal();
					}
				}

				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1260);
				match(INT);
				setState(1265);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1261);
					match(LPAREN);
					setState(1262);
					length();
					setState(1263);
					match(RPAREN);
					}
				}

				setState(1268);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1267);
					match(UNSIGNED);
					}
				}

				setState(1271);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1270);
					null_or_notnull();
					}
				}

				setState(1275);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1273);
					match(DEFAULT);
					setState(1274);
					number_literal();
					}
				}

				}
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1277);
				match(BIGINT);
				setState(1282);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1278);
					match(LPAREN);
					setState(1279);
					length();
					setState(1280);
					match(RPAREN);
					}
				}

				setState(1285);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1284);
					match(UNSIGNED);
					}
				}

				setState(1288);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1287);
					null_or_notnull();
					}
				}

				setState(1292);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1290);
					match(DEFAULT);
					setState(1291);
					number_literal();
					}
				}

				}
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1294);
				match(DOUBLE);
				setState(1301);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1295);
					match(LPAREN);
					setState(1296);
					length();
					setState(1297);
					match(COMMA);
					setState(1298);
					number_literal();
					setState(1299);
					match(RPAREN);
					}
				}

				setState(1304);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1303);
					match(UNSIGNED);
					}
				}

				setState(1307);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1306);
					null_or_notnull();
					}
				}

				setState(1311);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1309);
					match(DEFAULT);
					setState(1310);
					number_literal();
					}
				}

				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1313);
				match(FLOAT);
				setState(1320);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1314);
					match(LPAREN);
					setState(1315);
					length();
					setState(1316);
					match(COMMA);
					setState(1317);
					number_literal();
					setState(1318);
					match(RPAREN);
					}
				}

				setState(1323);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1322);
					match(UNSIGNED);
					}
				}

				setState(1326);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1325);
					null_or_notnull();
					}
				}

				setState(1330);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1328);
					match(DEFAULT);
					setState(1329);
					number_literal();
					}
				}

				}
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1332);
				match(DECIMAL);
				setState(1341);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1333);
					match(LPAREN);
					setState(1334);
					length();
					setState(1337);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1335);
						match(COMMA);
						setState(1336);
						number_literal();
						}
					}

					setState(1339);
					match(RPAREN);
					}
				}

				setState(1344);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1343);
					match(UNSIGNED);
					}
				}

				setState(1347);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1346);
					null_or_notnull();
					}
				}

				setState(1351);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1349);
					match(DEFAULT);
					setState(1350);
					number_literal();
					}
				}

				}
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1353);
				match(DATE);
				setState(1355);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1354);
					null_or_notnull();
					}
				}

				setState(1359);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1357);
					match(DEFAULT);
					setState(1358);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1361);
				match(TIMESTAMP);
				setState(1363);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1362);
					null_or_notnull();
					}
				}

				setState(1367);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1365);
					match(DEFAULT);
					setState(1366);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1369);
				match(DATETIME);
				setState(1371);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1370);
					null_or_notnull();
					}
				}

				setState(1375);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1373);
					match(DEFAULT);
					setState(1374);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(1377);
				match(VARCHAR);
				setState(1378);
				match(LPAREN);
				setState(1379);
				varchar_length();
				setState(1380);
				match(RPAREN);
				setState(1382);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1381);
					null_or_notnull();
					}
				}

				setState(1386);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1384);
					match(DEFAULT);
					setState(1385);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(1388);
				match(BINARY);
				setState(1393);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1389);
					match(LPAREN);
					setState(1390);
					binary_length();
					setState(1391);
					match(RPAREN);
					}
				}

				setState(1396);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1395);
					null_or_notnull();
					}
				}

				setState(1400);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1398);
					match(DEFAULT);
					setState(1399);
					match(TEXT_STRING);
					}
				}

				}
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(1402);
				match(BOOLEAN);
				setState(1404);
				_la = _input.LA(1);
				if (_la==NOT || _la==NULL) {
					{
					setState(1403);
					null_or_notnull();
					}
				}

				setState(1408);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1406);
					match(DEFAULT);
					setState(1407);
					match(TEXT_STRING);
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
		enterRule(_localctx, 238, RULE_index_column_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			column_name();
			setState(1416);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1413);
				match(LPAREN);
				setState(1414);
				match(INTEGER_NUM);
				setState(1415);
				match(RPAREN);
				}
			}

			setState(1419);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1418);
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

	public static class Reference_definitionContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(uniformSQLParser.REFERENCES, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(uniformSQLParser.LPAREN, 0); }
		public List<Index_column_nameContext> index_column_name() {
			return getRuleContexts(Index_column_nameContext.class);
		}
		public Index_column_nameContext index_column_name(int i) {
			return getRuleContext(Index_column_nameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(uniformSQLParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(uniformSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(uniformSQLParser.COMMA, i);
		}
		public List<TerminalNode> ON() { return getTokens(uniformSQLParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(uniformSQLParser.ON, i);
		}
		public TerminalNode DELETE() { return getToken(uniformSQLParser.DELETE, 0); }
		public List<Reference_optionContext> reference_option() {
			return getRuleContexts(Reference_optionContext.class);
		}
		public Reference_optionContext reference_option(int i) {
			return getRuleContext(Reference_optionContext.class,i);
		}
		public TerminalNode UPDATE() { return getToken(uniformSQLParser.UPDATE, 0); }
		public Reference_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitReference_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_definitionContext reference_definition() throws RecognitionException {
		Reference_definitionContext _localctx = new Reference_definitionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_reference_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			match(REFERENCES);
			setState(1422);
			table_spec();
			setState(1423);
			match(LPAREN);
			setState(1424);
			index_column_name();
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1425);
				match(COMMA);
				setState(1426);
				index_column_name();
				}
				}
				setState(1431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1432);
			match(RPAREN);
			setState(1436);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1433);
				match(ON);
				setState(1434);
				match(DELETE);
				setState(1435);
				reference_option();
				}
				break;
			}
			setState(1441);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1438);
				match(ON);
				setState(1439);
				match(UPDATE);
				setState(1440);
				reference_option();
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

	public static class Reference_optionContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(uniformSQLParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(uniformSQLParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(uniformSQLParser.SET, 0); }
		public TerminalNode NULL() { return getToken(uniformSQLParser.NULL, 0); }
		public Reference_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitReference_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_optionContext reference_option() throws RecognitionException {
		Reference_optionContext _localctx = new Reference_optionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_reference_option);
		try {
			setState(1447);
			switch (_input.LA(1)) {
			case RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1443);
				match(RESTRICT);
				}
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1444);
				match(CASCADE);
				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1445);
				match(SET);
				setState(1446);
				match(NULL);
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
		enterRule(_localctx, 244, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
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
		enterRule(_localctx, 246, RULE_varchar_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
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
		enterRule(_localctx, 248, RULE_binary_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
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
		enterRule(_localctx, 250, RULE_alter_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			match(ALTER);
			setState(1456);
			match(TABLE);
			setState(1457);
			table_spec();
			setState(1466);
			_la = _input.LA(1);
			if (_la==CHANGE || _la==RENAME) {
				{
				setState(1458);
				alter_table_specification();
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1459);
					match(COMMA);
					setState(1460);
					alter_table_specification();
					}
					}
					setState(1465);
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
		enterRule(_localctx, 252, RULE_alter_table_specification);
		try {
			setState(1478);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1468);
				match(RENAME);
				setState(1469);
				match(TO);
				setState(1470);
				table_spec();
				}
				}
				break;
			case CHANGE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1471);
				match(CHANGE);
				setState(1473);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1472);
					match(COLUMN);
					}
					break;
				}
				setState(1475);
				column_name();
				setState(1476);
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
		enterRule(_localctx, 254, RULE_index_column_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			index_column_name();
			setState(1485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1481);
				match(COMMA);
				setState(1482);
				index_column_name();
				}
				}
				setState(1487);
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
		enterRule(_localctx, 256, RULE_index_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(USING);
			{
			setState(1489);
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
		enterRule(_localctx, 258, RULE_index_option);
		try {
			setState(1494);
			switch (_input.LA(1)) {
			case USING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1491);
				index_type();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1492);
				match(COMMENT);
				setState(1493);
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
		enterRule(_localctx, 260, RULE_column_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			column_name();
			setState(1497);
			column_definition();
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1498);
				match(COMMA);
				setState(1499);
				column_name();
				setState(1500);
				column_definition();
				}
				}
				setState(1506);
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
		enterRule(_localctx, 262, RULE_rename_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			match(RENAME);
			setState(1508);
			match(TABLE);
			setState(1509);
			table_spec();
			setState(1510);
			match(TO);
			setState(1511);
			table_spec();
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1512);
				match(COMMA);
				setState(1513);
				table_spec();
				setState(1514);
				match(TO);
				setState(1515);
				table_spec();
				}
				}
				setState(1521);
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
		enterRule(_localctx, 264, RULE_drop_table_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			match(DROP);
			setState(1523);
			match(TABLE);
			setState(1526);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1524);
				match(IF);
				setState(1525);
				match(EXISTS);
				}
				break;
			}
			setState(1528);
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
		enterRule(_localctx, 266, RULE_drop_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			match(DROP);
			setState(1531);
			match(VIEW);
			setState(1534);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1532);
				match(IF);
				setState(1533);
				match(EXISTS);
				}
				break;
			}
			setState(1536);
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

	public static class Truncate_table_statementContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(uniformSQLParser.TRUNCATE, 0); }
		public Table_specContext table_spec() {
			return getRuleContext(Table_specContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(uniformSQLParser.TABLE, 0); }
		public Truncate_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_table_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof uniformSQLVisitor ) return ((uniformSQLVisitor<? extends T>)visitor).visitTruncate_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Truncate_table_statementContext truncate_table_statement() throws RecognitionException {
		Truncate_table_statementContext _localctx = new Truncate_table_statementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_truncate_table_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			match(TRUNCATE);
			setState(1540);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1539);
				match(TABLE);
				}
				break;
			}
			setState(1542);
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
		enterRule(_localctx, 270, RULE_create_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			match(CREATE);
			setState(1545);
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
		enterRule(_localctx, 272, RULE_create_view_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			match(VIEW);
			setState(1551);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1548);
				database_name();
				setState(1549);
				match(DOT);
				}
				break;
			}
			setState(1553);
			view_name();
			setState(1557);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1554);
				match(IF);
				setState(1555);
				match(NOT);
				setState(1556);
				match(EXISTS);
				}
			}

			setState(1560);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1559);
				column_list();
				}
			}

			setState(1562);
			match(AS);
			setState(1563);
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
		enterRule(_localctx, 274, RULE_alter_view_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(ALTER);
			setState(1566);
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
		enterRule(_localctx, 276, RULE_create_user_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			match(CREATE);
			setState(1569);
			match(USER);
			setState(1570);
			user_name();
			setState(1571);
			match(IDENTIFIED);
			setState(1572);
			match(BY);
			setState(1573);
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
		enterRule(_localctx, 278, RULE_drop_user_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			match(DROP);
			setState(1576);
			match(USER);
			setState(1577);
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
		enterRule(_localctx, 280, RULE_grant_privilege_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			match(GRANT);
			setState(1580);
			priv_type();
			setState(1585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1581);
				match(COMMA);
				setState(1582);
				priv_type();
				}
				}
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1588);
			match(ON);
			setState(1591);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1589);
				table_spec();
				}
				break;
			case 2:
				{
				setState(1590);
				view_name();
				}
				break;
			}
			setState(1593);
			match(TO);
			setState(1594);
			principal_specification();
			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1595);
				match(COMMA);
				setState(1596);
				principal_specification();
				}
				}
				setState(1601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1605);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1602);
				match(WITH);
				setState(1603);
				match(GRANT);
				setState(1604);
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
		enterRule(_localctx, 282, RULE_principal_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1607);
				match(USER);
				}
				break;
			}
			setState(1610);
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
		enterRule(_localctx, 284, RULE_revoke_privilege_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			match(REVOKE);
			setState(1616);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(1613);
				match(GRANT);
				setState(1614);
				match(OPTION);
				setState(1615);
				match(FOR);
				}
			}

			setState(1618);
			priv_type();
			setState(1623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1619);
				match(COMMA);
				setState(1620);
				priv_type();
				}
				}
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1626);
			match(ON);
			setState(1629);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1627);
				table_spec();
				}
				break;
			case 2:
				{
				setState(1628);
				view_name();
				}
				break;
			}
			setState(1631);
			match(FROM);
			setState(1632);
			principal_specification();
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1633);
				match(COMMA);
				setState(1634);
				principal_specification();
				}
				}
				setState(1639);
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
		enterRule(_localctx, 286, RULE_show_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(SHOW);
			setState(1641);
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
		public TerminalNode SERVER() { return getToken(uniformSQLParser.SERVER, 0); }
		public TerminalNode ALIASES() { return getToken(uniformSQLParser.ALIASES, 0); }
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
		enterRule(_localctx, 288, RULE_show_specification);
		int _la;
		try {
			setState(1677);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1643);
				match(CREATE);
				setState(1644);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1645);
				table_spec();
				}
				break;
			case COLUMNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1646);
				match(COLUMNS);
				setState(1647);
				match(FROM);
				setState(1648);
				table_spec();
				}
				break;
			case DATABASES:
			case SCHEMAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1649);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==SCHEMAS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1652);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(1650);
					match(LIKE);
					setState(1651);
					match(TEXT_STRING);
					}
				}

				}
				break;
			case SERVER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1654);
				match(SERVER);
				setState(1655);
				match(ALIASES);
				}
				break;
			case TABLES:
				enterOuterAlt(_localctx, 5);
				{
				setState(1656);
				match(TABLES);
				setState(1659);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(1657);
					match(IN);
					setState(1658);
					database_name();
					}
				}

				setState(1662);
				_la = _input.LA(1);
				if (_la==TEXT_STRING) {
					{
					setState(1661);
					match(TEXT_STRING);
					}
				}

				}
				break;
			case GRANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1664);
				match(GRANT);
				setState(1667);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1665);
					principal_name();
					}
					break;
				case 2:
					{
					setState(1666);
					principal_specification();
					}
					break;
				}
				setState(1669);
				match(ON);
				setState(1675);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1670);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1672);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						setState(1671);
						match(TABLE);
						}
						break;
					}
					setState(1674);
					table_spec();
					}
					break;
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
		enterRule(_localctx, 290, RULE_set_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			match(SET);
			setState(1680);
			match(TABLE);
			setState(1681);
			table_spec();
			setState(1682);
			match(TO);
			setState(1683);
			server_alias_name();
			setState(1684);
			match(DOT);
			setState(1685);
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
		enterRule(_localctx, 292, RULE_use_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			match(USE);
			setState(1688);
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
		enterRule(_localctx, 294, RULE_server_event_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
			match(SERVER);
			setState(1691);
			match(ALIAS);
			setState(1692);
			server_alias_name();
			setState(1693);
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
		enterRule(_localctx, 296, RULE_update_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(UPDATE);
			setState(1696);
			table_spec();
			setState(1697);
			set_columns_cluase();
			setState(1698);
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
		enterRule(_localctx, 298, RULE_delete_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			match(DELETE);
			setState(1701);
			match(FROM);
			setState(1702);
			table_spec();
			setState(1704);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1703);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0153\u06ad\4\2\t"+
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
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u0140\n\4\3\5\3\5\3\6\3\6\5\6\u0146\n\6\3\6\3\6\5\6\u014a\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0153\n\6\3\6\5\6\u0156\n\6\3\6\3\6"+
		"\5\6\u015a\n\6\3\6\3\6\5\6\u015e\n\6\5\6\u0160\n\6\3\7\3\7\3\b\3\b\3\t"+
		"\5\t\u0167\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0177\n\r\3\16\3\16\3\16\3\16\5\16\u017d\n\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\5\'\u01b0"+
		"\n\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\5-\u01c2\n-\3."+
		"\3.\3/\3/\3/\7/\u01c9\n/\f/\16/\u01cc\13/\3\60\3\60\3\60\7\60\u01d1\n"+
		"\60\f\60\16\60\u01d4\13\60\3\61\3\61\3\61\7\61\u01d9\n\61\f\61\16\61\u01dc"+
		"\13\61\3\62\5\62\u01df\n\62\3\62\3\62\3\63\3\63\3\63\5\63\u01e6\n\63\3"+
		"\63\3\63\5\63\u01ea\n\63\5\63\u01ec\n\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u01f5\n\64\3\64\3\64\3\64\5\64\u01fa\n\64\3\64\3\64\3\64\5"+
		"\64\u01ff\n\64\3\65\3\65\5\65\u0203\n\65\3\65\3\65\3\65\5\65\u0208\n\65"+
		"\3\65\3\65\5\65\u020c\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0215"+
		"\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u021c\n\65\3\65\3\65\3\65\3\65\5\65"+
		"\u0222\n\65\3\66\3\66\3\66\5\66\u0227\n\66\3\67\3\67\3\67\5\67\u022c\n"+
		"\67\38\38\38\58\u0231\n8\39\39\39\79\u0236\n9\f9\169\u0239\139\3:\3:\3"+
		":\7:\u023e\n:\f:\16:\u0241\13:\3;\3;\3;\5;\u0246\n;\3<\3<\3<\5<\u024b"+
		"\n<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0258\n>\3?\3?\3?\3?\3?\7?\u025f"+
		"\n?\f?\16?\u0262\13?\5?\u0264\n?\3?\5?\u0267\n?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\5?\u0273\n?\3?\3?\3?\5?\u0278\n?\3@\3@\5@\u027c\n@\3A\3A\3A\3"+
		"A\3A\3A\6A\u0284\nA\rA\16A\u0285\3A\3A\5A\u028a\nA\3A\3A\3A\3B\3B\3B\3"+
		"B\3B\3B\3B\6B\u0296\nB\rB\16B\u0297\3B\3B\5B\u029c\nB\3B\3B\3C\3C\3C\5"+
		"C\u02a3\nC\3C\3C\3D\3D\3D\6D\u02aa\nD\rD\16D\u02ab\3D\3D\3D\6D\u02b1\n"+
		"D\rD\16D\u02b2\5D\u02b5\nD\3E\3E\3E\3E\7E\u02bb\nE\fE\16E\u02be\13E\3"+
		"E\3E\3F\3F\3F\3F\3G\3G\3G\7G\u02c9\nG\fG\16G\u02cc\13G\3H\3H\5H\u02d0"+
		"\nH\3I\3I\5I\u02d4\nI\3I\5I\u02d7\nI\3I\5I\u02da\nI\3I\3I\3I\5I\u02df"+
		"\nI\7I\u02e1\nI\fI\16I\u02e4\13I\3J\3J\3J\5J\u02e9\nJ\3J\3J\3J\3J\7J\u02ef"+
		"\nJ\fJ\16J\u02f2\13J\3K\3K\5K\u02f6\nK\3K\3K\5K\u02fa\nK\5K\u02fc\nK\3"+
		"K\3K\5K\u0300\nK\3L\3L\5L\u0304\nL\3L\3L\5L\u0308\nL\3L\3L\3L\3L\3L\5"+
		"L\u030f\nL\3M\3M\3M\3N\3N\3N\7N\u0317\nN\fN\16N\u031a\13N\3O\3O\3O\3O"+
		"\3O\3O\3O\5O\u0323\nO\5O\u0325\nO\3P\3P\3P\3P\5P\u032b\nP\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\5P\u0335\nP\3Q\3Q\3Q\7Q\u033a\nQ\fQ\16Q\u033d\13Q\3R\3R\3"+
		"R\3R\3R\3S\3S\3S\7S\u0347\nS\fS\16S\u034a\13S\3T\3T\5T\u034e\nT\3T\5T"+
		"\u0351\nT\3U\3U\3U\3U\3U\5U\u0358\nU\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\5V\u0369\nV\3W\3W\3W\5W\u036e\nW\3W\7W\u0371\nW\fW\16W\u0374"+
		"\13W\3X\3X\5X\u0378\nX\3X\3X\3X\3X\5X\u037e\nX\3X\5X\u0381\nX\3X\5X\u0384"+
		"\nX\5X\u0386\nX\3X\5X\u0389\nX\3X\5X\u038c\nX\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z"+
		"\7Z\u0396\nZ\fZ\16Z\u0399\13Z\3Z\3Z\5Z\u039d\nZ\3[\3[\3[\5[\u03a2\n[\3"+
		"\\\3\\\3\\\3]\3]\3]\3]\3]\7]\u03ac\n]\f]\16]\u03af\13]\3^\3^\5^\u03b3"+
		"\n^\3_\3_\3_\3_\5_\u03b9\n_\3_\3_\3`\3`\3a\3a\3b\3b\3b\7b\u03c4\nb\fb"+
		"\16b\u03c7\13b\3c\3c\3c\3c\7c\u03cd\nc\fc\16c\u03d0\13c\3c\3c\3d\3d\3"+
		"d\3d\3e\3e\3e\5e\u03db\ne\3e\3e\3f\3f\3f\3f\3f\3f\3f\5f\u03e6\nf\3f\3"+
		"f\5f\u03ea\nf\5f\u03ec\nf\3g\3g\3h\3h\5h\u03f2\nh\3h\5h\u03f5\nh\3h\5"+
		"h\u03f8\nh\3h\3h\5h\u03fc\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\7i\u040a"+
		"\ni\fi\16i\u040d\13i\3j\3j\5j\u0411\nj\3j\3j\5j\u0415\nj\3j\5j\u0418\n"+
		"j\3k\3k\3k\3k\7k\u041e\nk\fk\16k\u0421\13k\3l\3l\3l\5l\u0426\nl\3l\3l"+
		"\3l\5l\u042b\nl\7l\u042d\nl\fl\16l\u0430\13l\3l\3l\3m\3m\3m\3m\7m\u0438"+
		"\nm\fm\16m\u043b\13m\3n\3n\3n\3n\5n\u0441\nn\3o\3o\3o\3o\3o\5o\u0448\n"+
		"o\3o\3o\3p\3p\3p\3p\5p\u0450\np\3p\3p\3q\3q\3q\5q\u0457\nq\3r\3r\5r\u045b"+
		"\nr\3r\5r\u045e\nr\3r\3r\3r\3r\5r\u0464\nr\3r\3r\3r\3r\3r\7r\u046b\nr"+
		"\fr\16r\u046e\13r\3r\3r\5r\u0472\nr\3r\3r\5r\u0476\nr\3r\3r\5r\u047a\n"+
		"r\3s\3s\5s\u047e\ns\3s\5s\u0481\ns\3s\3s\3s\3s\5s\u0487\ns\3s\3s\3s\3"+
		"s\3t\3t\5t\u048f\nt\3t\5t\u0492\nt\3t\3t\3t\3t\5t\u0498\nt\3t\3t\3t\3"+
		"t\3t\3t\3t\3t\5t\u04a2\nt\3u\3u\3u\3u\3u\5u\u04a9\nu\3u\5u\u04ac\nu\3"+
		"u\3u\3u\3u\7u\u04b2\nu\fu\16u\u04b5\13u\3u\3u\7u\u04b9\nu\fu\16u\u04bc"+
		"\13u\5u\u04be\nu\3v\3v\3v\5v\u04c3\nv\3v\5v\u04c6\nv\3w\3w\3w\5w\u04cb"+
		"\nw\3x\3x\3x\3x\3x\5x\u04d2\nx\3x\5x\u04d5\nx\3x\5x\u04d8\nx\3x\3x\5x"+
		"\u04dc\nx\3x\3x\3x\3x\3x\5x\u04e3\nx\3x\5x\u04e6\nx\3x\5x\u04e9\nx\3x"+
		"\3x\5x\u04ed\nx\3x\3x\3x\3x\3x\5x\u04f4\nx\3x\5x\u04f7\nx\3x\5x\u04fa"+
		"\nx\3x\3x\5x\u04fe\nx\3x\3x\3x\3x\3x\5x\u0505\nx\3x\5x\u0508\nx\3x\5x"+
		"\u050b\nx\3x\3x\5x\u050f\nx\3x\3x\3x\3x\3x\3x\3x\5x\u0518\nx\3x\5x\u051b"+
		"\nx\3x\5x\u051e\nx\3x\3x\5x\u0522\nx\3x\3x\3x\3x\3x\3x\3x\5x\u052b\nx"+
		"\3x\5x\u052e\nx\3x\5x\u0531\nx\3x\3x\5x\u0535\nx\3x\3x\3x\3x\3x\5x\u053c"+
		"\nx\3x\3x\5x\u0540\nx\3x\5x\u0543\nx\3x\5x\u0546\nx\3x\3x\5x\u054a\nx"+
		"\3x\3x\5x\u054e\nx\3x\3x\5x\u0552\nx\3x\3x\5x\u0556\nx\3x\3x\5x\u055a"+
		"\nx\3x\3x\5x\u055e\nx\3x\3x\5x\u0562\nx\3x\3x\3x\3x\3x\5x\u0569\nx\3x"+
		"\3x\5x\u056d\nx\3x\3x\3x\3x\3x\5x\u0574\nx\3x\5x\u0577\nx\3x\3x\5x\u057b"+
		"\nx\3x\3x\5x\u057f\nx\3x\3x\5x\u0583\nx\5x\u0585\nx\3y\3y\3y\3y\5y\u058b"+
		"\ny\3y\5y\u058e\ny\3z\3z\3z\3z\3z\3z\7z\u0596\nz\fz\16z\u0599\13z\3z\3"+
		"z\3z\3z\5z\u059f\nz\3z\3z\3z\5z\u05a4\nz\3{\3{\3{\3{\5{\u05aa\n{\3|\3"+
		"|\3}\3}\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\7\177\u05b8\n\177\f"+
		"\177\16\177\u05bb\13\177\5\177\u05bd\n\177\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\5\u0080\u05c4\n\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u05c9\n"+
		"\u0080\3\u0081\3\u0081\3\u0081\7\u0081\u05ce\n\u0081\f\u0081\16\u0081"+
		"\u05d1\13\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\5\u0083"+
		"\u05d9\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084"+
		"\u05e1\n\u0084\f\u0084\16\u0084\u05e4\13\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u05f0"+
		"\n\u0085\f\u0085\16\u0085\u05f3\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u05f9\n\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\5\u0087\u0601\n\u0087\3\u0087\3\u0087\3\u0088\3\u0088\5\u0088\u0607\n"+
		"\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\5\u008a\u0612\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u0618\n\u008a\3\u008a\5\u008a\u061b\n\u008a\3\u008a\3\u008a\3\u008a\3"+
		"\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\7\u008e\u0632\n\u008e\f\u008e\16\u008e\u0635\13\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u063a\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e"+
		"\u0640\n\u008e\f\u008e\16\u008e\u0643\13\u008e\3\u008e\3\u008e\3\u008e"+
		"\5\u008e\u0648\n\u008e\3\u008f\5\u008f\u064b\n\u008f\3\u008f\3\u008f\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0653\n\u0090\3\u0090\3\u0090\3"+
		"\u0090\7\u0090\u0658\n\u0090\f\u0090\16\u0090\u065b\13\u0090\3\u0090\3"+
		"\u0090\3\u0090\5\u0090\u0660\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7"+
		"\u0090\u0666\n\u0090\f\u0090\16\u0090\u0669\13\u0090\3\u0091\3\u0091\3"+
		"\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u0677\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\5\u0092\u067e\n\u0092\3\u0092\5\u0092\u0681\n\u0092\3\u0092\3\u0092\3"+
		"\u0092\5\u0092\u0686\n\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u068b\n\u0092"+
		"\3\u0092\5\u0092\u068e\n\u0092\5\u0092\u0690\n\u0092\3\u0093\3\u0093\3"+
		"\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u06ab\n\u0097\3\u0097"+
		"\2\2\u0098\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\2\33\4\2\3\u0098"+
		"\u009b\u0134\4\2\u012e\u0131\u0144\u0145\4\2\u0107\u010b\u010d\u010d\3"+
		"\2\u013e\u013f\4\2\u0147\u0147\u014c\u014c\3\2\3\4\3\2\u00ec\u00fb\5\2"+
		"\u00fc\u0104\u0121\u0121\u0125\u0126\4\2\u0106\u010f\u0122\u0122\4\2\u0116"+
		"\u0116\u0127\u0127\3\2\u0111\u0115\7\2\5\5\23\23\25\25\u00a3\u00a3\u00d1"+
		"\u00d1\3\2\u0133\u0134\5\2\u0128\u0129\u0139\u0139\u0143\u0143\4\2\u00c1"+
		"\u00c1\u013e\u0140\5\2\5\5\24\24\u0139\u0139\3\2\33\35\4\2$$ii\4\2\5\5"+
		"\24\24\3\2\n\13\3\2\u011d\u011e\3\2\u011b\u011c\4\2\u00a8\u00a8\u00ab"+
		"\u00ab\4\2!!\u00a6\u00a6\4\2\u00a9\u00a9\u00ac\u00ac\u073d\2\u012e\3\2"+
		"\2\2\4\u0130\3\2\2\2\6\u013f\3\2\2\2\b\u0141\3\2\2\2\n\u015f\3\2\2\2\f"+
		"\u0161\3\2\2\2\16\u0163\3\2\2\2\20\u0166\3\2\2\2\22\u016a\3\2\2\2\24\u016c"+
		"\3\2\2\2\26\u016e\3\2\2\2\30\u0176\3\2\2\2\32\u017c\3\2\2\2\34\u017e\3"+
		"\2\2\2\36\u0180\3\2\2\2 \u0182\3\2\2\2\"\u0184\3\2\2\2$\u0186\3\2\2\2"+
		"&\u0188\3\2\2\2(\u018a\3\2\2\2*\u018c\3\2\2\2,\u018e\3\2\2\2.\u0190\3"+
		"\2\2\2\60\u0192\3\2\2\2\62\u0194\3\2\2\2\64\u0196\3\2\2\2\66\u0198\3\2"+
		"\2\28\u019a\3\2\2\2:\u019c\3\2\2\2<\u019e\3\2\2\2>\u01a0\3\2\2\2@\u01a2"+
		"\3\2\2\2B\u01a4\3\2\2\2D\u01a6\3\2\2\2F\u01a8\3\2\2\2H\u01aa\3\2\2\2J"+
		"\u01ac\3\2\2\2L\u01af\3\2\2\2N\u01b3\3\2\2\2P\u01b5\3\2\2\2R\u01b7\3\2"+
		"\2\2T\u01b9\3\2\2\2V\u01bb\3\2\2\2X\u01c1\3\2\2\2Z\u01c3\3\2\2\2\\\u01c5"+
		"\3\2\2\2^\u01cd\3\2\2\2`\u01d5\3\2\2\2b\u01de\3\2\2\2d\u01e2\3\2\2\2f"+
		"\u01fe\3\2\2\2h\u0221\3\2\2\2j\u0223\3\2\2\2l\u0228\3\2\2\2n\u022d\3\2"+
		"\2\2p\u0232\3\2\2\2r\u023a\3\2\2\2t\u0242\3\2\2\2v\u024a\3\2\2\2x\u024c"+
		"\3\2\2\2z\u0257\3\2\2\2|\u0277\3\2\2\2~\u027b\3\2\2\2\u0080\u027d\3\2"+
		"\2\2\u0082\u028e\3\2\2\2\u0084\u02a2\3\2\2\2\u0086\u02b4\3\2\2\2\u0088"+
		"\u02b6\3\2\2\2\u008a\u02c1\3\2\2\2\u008c\u02c5\3\2\2\2\u008e\u02cf\3\2"+
		"\2\2\u0090\u02d1\3\2\2\2\u0092\u02e5\3\2\2\2\u0094\u02f3\3\2\2\2\u0096"+
		"\u030e\3\2\2\2\u0098\u0310\3\2\2\2\u009a\u0313\3\2\2\2\u009c\u031b\3\2"+
		"\2\2\u009e\u0334\3\2\2\2\u00a0\u0336\3\2\2\2\u00a2\u033e\3\2\2\2\u00a4"+
		"\u0343\3\2\2\2\u00a6\u034d\3\2\2\2\u00a8\u0357\3\2\2\2\u00aa\u0368\3\2"+
		"\2\2\u00ac\u036a\3\2\2\2\u00ae\u0375\3\2\2\2\u00b0\u038d\3\2\2\2\u00b2"+
		"\u0390\3\2\2\2\u00b4\u03a1\3\2\2\2\u00b6\u03a3\3\2\2\2\u00b8\u03a6\3\2"+
		"\2\2\u00ba\u03b0\3\2\2\2\u00bc\u03b4\3\2\2\2\u00be\u03bc\3\2\2\2\u00c0"+
		"\u03be\3\2\2\2\u00c2\u03c0\3\2\2\2\u00c4\u03c8\3\2\2\2\u00c6\u03d3\3\2"+
		"\2\2\u00c8\u03da\3\2\2\2\u00ca\u03eb\3\2\2\2\u00cc\u03ed\3\2\2\2\u00ce"+
		"\u03ef\3\2\2\2\u00d0\u03fd\3\2\2\2\u00d2\u040e\3\2\2\2\u00d4\u0419\3\2"+
		"\2\2\u00d6\u0422\3\2\2\2\u00d8\u0433\3\2\2\2\u00da\u043c\3\2\2\2\u00dc"+
		"\u0442\3\2\2\2\u00de\u044b\3\2\2\2\u00e0\u0456\3\2\2\2\u00e2\u0458\3\2"+
		"\2\2\u00e4\u047b\3\2\2\2\u00e6\u048c\3\2\2\2\u00e8\u04bd\3\2\2\2\u00ea"+
		"\u04bf\3\2\2\2\u00ec\u04ca\3\2\2\2\u00ee\u0584\3\2\2\2\u00f0\u0586\3\2"+
		"\2\2\u00f2\u058f\3\2\2\2\u00f4\u05a9\3\2\2\2\u00f6\u05ab\3\2\2\2\u00f8"+
		"\u05ad\3\2\2\2\u00fa\u05af\3\2\2\2\u00fc\u05b1\3\2\2\2\u00fe\u05c8\3\2"+
		"\2\2\u0100\u05ca\3\2\2\2\u0102\u05d2\3\2\2\2\u0104\u05d8\3\2\2\2\u0106"+
		"\u05da\3\2\2\2\u0108\u05e5\3\2\2\2\u010a\u05f4\3\2\2\2\u010c\u05fc\3\2"+
		"\2\2\u010e\u0604\3\2\2\2\u0110\u060a\3\2\2\2\u0112\u060d\3\2\2\2\u0114"+
		"\u061f\3\2\2\2\u0116\u0622\3\2\2\2\u0118\u0629\3\2\2\2\u011a\u062d\3\2"+
		"\2\2\u011c\u064a\3\2\2\2\u011e\u064e\3\2\2\2\u0120\u066a\3\2\2\2\u0122"+
		"\u068f\3\2\2\2\u0124\u0691\3\2\2\2\u0126\u0699\3\2\2\2\u0128\u069c\3\2"+
		"\2\2\u012a\u06a1\3\2\2\2\u012c\u06a6\3\2\2\2\u012e\u012f\t\2\2\2\u012f"+
		"\3\3\2\2\2\u0130\u0131\7\u0153\2\2\u0131\5\3\2\2\2\u0132\u0140\3\2\2\2"+
		"\u0133\u0140\7I\2\2\u0134\u0140\7J\2\2\u0135\u0140\7K\2\2\u0136\u0140"+
		"\7L\2\2\u0137\u0140\7H\2\2\u0138\u0140\7M\2\2\u0139\u0140\7N\2\2\u013a"+
		"\u0140\7O\2\2\u013b\u0140\7Q\2\2\u013c\u0140\7T\2\2\u013d\u0140\7\u00c1"+
		"\2\2\u013e\u0140\7R\2\2\u013f\u0132\3\2\2\2\u013f\u0133\3\2\2\2\u013f"+
		"\u0134\3\2\2\2\u013f\u0135\3\2\2\2\u013f\u0136\3\2\2\2\u013f\u0137\3\2"+
		"\2\2\u013f\u0138\3\2\2\2\u013f\u0139\3\2\2\2\u013f\u013a\3\2\2\2\u013f"+
		"\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2"+
		"\2\2\u0140\7\3\2\2\2\u0141\u0142\t\3\2\2\u0142\t\3\2\2\2\u0143\u0145\7"+
		"\u00c1\2\2\u0144\u0146\7\u0147\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0160\3\2\2\2\u0147\u0149\7\u00eb\2\2\u0148\u014a\7\u0147\2"+
		"\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0160\3\2\2\2\u014b\u0160"+
		"\7O\2\2\u014c\u0160\7P\2\2\u014d\u0155\7R\2\2\u014e\u014f\7\u013b\2\2"+
		"\u014f\u0152\7\u0147\2\2\u0150\u0151\7\u0138\2\2\u0151\u0153\7\u0147\2"+
		"\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156"+
		"\7\u013a\2\2\u0155\u014e\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0160\3\2\2"+
		"\2\u0157\u0159\7\u0123\2\2\u0158\u015a\7\u0124\2\2\u0159\u0158\3\2\2\2"+
		"\u0159\u015a\3\2\2\2\u015a\u0160\3\2\2\2\u015b\u015d\7\u00b7\2\2\u015c"+
		"\u015e\7\u0124\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160"+
		"\3\2\2\2\u015f\u0143\3\2\2\2\u015f\u0147\3\2\2\2\u015f\u014b\3\2\2\2\u015f"+
		"\u014c\3\2\2\2\u015f\u014d\3\2\2\2\u015f\u0157\3\2\2\2\u015f\u015b\3\2"+
		"\2\2\u0160\13\3\2\2\2\u0161\u0162\t\4\2\2\u0162\r\3\2\2\2\u0163\u0164"+
		"\7\u014d\2\2\u0164\17\3\2\2\2\u0165\u0167\t\5\2\2\u0166\u0165\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\t\6\2\2\u0169\21"+
		"\3\2\2\2\u016a\u016b\7\u014a\2\2\u016b\23\3\2\2\2\u016c\u016d\t\7\2\2"+
		"\u016d\25\3\2\2\2\u016e\u016f\7\u014b\2\2\u016f\27\3\2\2\2\u0170\u0177"+
		"\5\16\b\2\u0171\u0177\5\20\t\2\u0172\u0177\5\22\n\2\u0173\u0177\5\24\13"+
		"\2\u0174\u0177\5\26\f\2\u0175\u0177\79\2\2\u0176\u0170\3\2\2\2\u0176\u0171"+
		"\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0175\3\2\2\2\u0177\31\3\2\2\2\u0178\u017d\5\34\17\2\u0179\u017d\5\36"+
		"\20\2\u017a\u017d\5 \21\2\u017b\u017d\5\"\22\2\u017c\u0178\3\2\2\2\u017c"+
		"\u0179\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d\33\3\2\2"+
		"\2\u017e\u017f\t\b\2\2\u017f\35\3\2\2\2\u0180\u0181\t\t\2\2\u0181\37\3"+
		"\2\2\2\u0182\u0183\t\n\2\2\u0183!\3\2\2\2\u0184\u0185\t\13\2\2\u0185#"+
		"\3\2\2\2\u0186\u0187\t\f\2\2\u0187%\3\2\2\2\u0188\u0189\5X-\2\u0189\'"+
		"\3\2\2\2\u018a\u018b\5X-\2\u018b)\3\2\2\2\u018c\u018d\5X-\2\u018d+\3\2"+
		"\2\2\u018e\u018f\5X-\2\u018f-\3\2\2\2\u0190\u0191\5X-\2\u0191/\3\2\2\2"+
		"\u0192\u0193\5X-\2\u0193\61\3\2\2\2\u0194\u0195\5X-\2\u0195\63\3\2\2\2"+
		"\u0196\u0197\5X-\2\u0197\65\3\2\2\2\u0198\u0199\5X-\2\u0199\67\3\2\2\2"+
		"\u019a\u019b\5X-\2\u019b9\3\2\2\2\u019c\u019d\5X-\2\u019d;\3\2\2\2\u019e"+
		"\u019f\5X-\2\u019f=\3\2\2\2\u01a0\u01a1\5X-\2\u01a1?\3\2\2\2\u01a2\u01a3"+
		"\5X-\2\u01a3A\3\2\2\2\u01a4\u01a5\5X-\2\u01a5C\3\2\2\2\u01a6\u01a7\5X"+
		"-\2\u01a7E\3\2\2\2\u01a8\u01a9\5X-\2\u01a9G\3\2\2\2\u01aa\u01ab\5X-\2"+
		"\u01abI\3\2\2\2\u01ac\u01ad\5X-\2\u01adK\3\2\2\2\u01ae\u01b0\7\22\2\2"+
		"\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2"+
		"\5X-\2\u01b2M\3\2\2\2\u01b3\u01b4\5X-\2\u01b4O\3\2\2\2\u01b5\u01b6\5X"+
		"-\2\u01b6Q\3\2\2\2\u01b7\u01b8\5X-\2\u01b8S\3\2\2\2\u01b9\u01ba\5X-\2"+
		"\u01baU\3\2\2\2\u01bb\u01bc\5X-\2\u01bcW\3\2\2\2\u01bd\u01c2\7\u014e\2"+
		"\2\u01be\u01c2\5\2\2\2\u01bf\u01c2\5\16\b\2\u01c0\u01c2\5|?\2\u01c1\u01bd"+
		"\3\2\2\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2"+
		"Y\3\2\2\2\u01c3\u01c4\t\r\2\2\u01c4[\3\2\2\2\u01c5\u01ca\5^\60\2\u01c6"+
		"\u01c7\7\u012a\2\2\u01c7\u01c9\5^\60\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc"+
		"\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb]\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01d2\5`\61\2\u01ce\u01cf\7\u012c\2\2\u01cf\u01d1"+
		"\5`\61\2\u01d0\u01ce\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3_\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01da\5b\62\2"+
		"\u01d6\u01d7\7\u012b\2\2\u01d7\u01d9\5b\62\2\u01d8\u01d6\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01dba\3\2\2\2"+
		"\u01dc\u01da\3\2\2\2\u01dd\u01df\7\6\2\2\u01de\u01dd\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\5d\63\2\u01e1c\3\2\2\2\u01e2"+
		"\u01eb\5f\64\2\u01e3\u01e5\78\2\2\u01e4\u01e6\7\6\2\2\u01e5\u01e4\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01ea\5\24\13\2\u01e8"+
		"\u01ea\79\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ec\3\2"+
		"\2\2\u01eb\u01e3\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ece\3\2\2\2\u01ed\u01ee"+
		"\5h\65\2\u01ee\u01ef\5\b\5\2\u01ef\u01f0\5h\65\2\u01f0\u01ff\3\2\2\2\u01f1"+
		"\u01f2\5h\65\2\u01f2\u01f4\5\b\5\2\u01f3\u01f5\7\5\2\2\u01f4\u01f3\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\5\u00c6d\2\u01f7"+
		"\u01ff\3\2\2\2\u01f8\u01fa\7\6\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\7\t\2\2\u01fc\u01ff\5\u00c6d\2\u01fd"+
		"\u01ff\5h\65\2\u01fe\u01ed\3\2\2\2\u01fe\u01f1\3\2\2\2\u01fe\u01f9\3\2"+
		"\2\2\u01fe\u01fd\3\2\2\2\u01ffg\3\2\2\2\u0200\u0202\5j\66\2\u0201\u0203"+
		"\7\6\2\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0207\7\u00a7\2\2\u0205\u0208\5\u00c6d\2\u0206\u0208\5\u0088E\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208\u0222\3\2\2\2\u0209\u020b\5j"+
		"\66\2\u020a\u020c\7\6\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\7\u00bf\2\2\u020e\u020f\5j\66\2\u020f\u0210"+
		"\7\u012b\2\2\u0210\u0211\5h\65\2\u0211\u0222\3\2\2\2\u0212\u0214\5j\66"+
		"\2\u0213\u0215\7\6\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216"+
		"\3\2\2\2\u0216\u0217\7\7\2\2\u0217\u0218\5z>\2\u0218\u0222\3\2\2\2\u0219"+
		"\u021b\5j\66\2\u021a\u021c\7\6\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021d\u021e\7\u0084\2\2\u021e\u021f\5j\66\2\u021f"+
		"\u0222\3\2\2\2\u0220\u0222\5j\66\2\u0221\u0200\3\2\2\2\u0221\u0209\3\2"+
		"\2\2\u0221\u0212\3\2\2\2\u0221\u0219\3\2\2\2\u0221\u0220\3\2\2\2\u0222"+
		"i\3\2\2\2\u0223\u0226\5l\67\2\u0224\u0225\7\u0141\2\2\u0225\u0227\5l\67"+
		"\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227k\3\2\2\2\u0228\u022b"+
		"\5n8\2\u0229\u022a\7\u0142\2\2\u022a\u022c\5n8\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022cm\3\2\2\2\u022d\u0230\5p9\2\u022e\u022f\t\16\2\2\u022f"+
		"\u0231\5p9\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231o\3\2\2\2\u0232"+
		"\u0237\5r:\2\u0233\u0234\t\5\2\2\u0234\u0236\5r:\2\u0235\u0233\3\2\2\2"+
		"\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238q\3"+
		"\2\2\2\u0239\u0237\3\2\2\2\u023a\u023f\5t;\2\u023b\u023c\t\17\2\2\u023c"+
		"\u023e\5t;\2\u023d\u023b\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2"+
		"\2\u023f\u0240\3\2\2\2\u0240s\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0245"+
		"\5v<\2\u0243\u0244\t\5\2\2\u0244\u0246\5\u008aF\2\u0245\u0243\3\2\2\2"+
		"\u0245\u0246\3\2\2\2\u0246u\3\2\2\2\u0247\u0248\t\20\2\2\u0248\u024b\5"+
		"z>\2\u0249\u024b\5z>\2\u024a\u0247\3\2\2\2\u024a\u0249\3\2\2\2\u024bw"+
		"\3\2\2\2\u024c\u024d\5z>\2\u024dy\3\2\2\2\u024e\u0258\5\30\r\2\u024f\u0258"+
		"\5\u0084C\2\u0250\u0258\5|?\2\u0251\u0258\5\u0088E\2\u0252\u0258\5\u0086"+
		"D\2\u0253\u0258\5\u00c6d\2\u0254\u0255\7\t\2\2\u0255\u0258\5\u00c6d\2"+
		"\u0256\u0258\5~@\2\u0257\u024e\3\2\2\2\u0257\u024f\3\2\2\2\u0257\u0250"+
		"\3\2\2\2\u0257\u0251\3\2\2\2\u0257\u0252\3\2\2\2\u0257\u0253\3\2\2\2\u0257"+
		"\u0254\3\2\2\2\u0257\u0256\3\2\2\2\u0258{\3\2\2\2\u0259\u0266\5\32\16"+
		"\2\u025a\u0263\7\u013b\2\2\u025b\u0260\5\\/\2\u025c\u025d\7\u0138\2\2"+
		"\u025d\u025f\5\\/\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0263"+
		"\u025b\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\7\u013a"+
		"\2\2\u0266\u025a\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0278\3\2\2\2\u0268"+
		"\u0269\7\u0080\2\2\u0269\u026a\7\u013b\2\2\u026a\u026b\5\\/\2\u026b\u026c"+
		"\7\22\2\2\u026c\u026d\5\n\6\2\u026d\u026e\7\u013a\2\2\u026e\u0278\3\2"+
		"\2\2\u026f\u0270\5$\23\2\u0270\u0272\7\u013b\2\2\u0271\u0273\t\21\2\2"+
		"\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275"+
		"\5j\66\2\u0275\u0276\7\u013a\2\2\u0276\u0278\3\2\2\2\u0277\u0259\3\2\2"+
		"\2\u0277\u0268\3\2\2\2\u0277\u026f\3\2\2\2\u0278}\3\2\2\2\u0279\u027c"+
		"\5\u0080A\2\u027a\u027c\5\u0082B\2\u027b\u0279\3\2\2\2\u027b\u027a\3\2"+
		"\2\2\u027c\177\3\2\2\2\u027d\u0283\7\u0099\2\2\u027e\u027f\7\u009a\2\2"+
		"\u027f\u0280\5\\/\2\u0280\u0281\7\u009b\2\2\u0281\u0282\5j\66\2\u0282"+
		"\u0284\3\2\2\2\u0283\u027e\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0283\3\2"+
		"\2\2\u0285\u0286\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0288\7\u009c\2\2\u0288"+
		"\u028a\5j\66\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2"+
		"\2\2\u028b\u028c\7\u009d\2\2\u028c\u028d\5L\'\2\u028d\u0081\3\2\2\2\u028e"+
		"\u028f\7\u0099\2\2\u028f\u0295\5j\66\2\u0290\u0291\7\u009a\2\2\u0291\u0292"+
		"\5j\66\2\u0292\u0293\7\u009b\2\2\u0293\u0294\5j\66\2\u0294\u0296\3\2\2"+
		"\2\u0295\u0290\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u029a\7\u009c\2\2\u029a\u029c\5j\66"+
		"\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e"+
		"\7\u009d\2\2\u029e\u0083\3\2\2\2\u029f\u02a0\5\u00c8e\2\u02a0\u02a1\7"+
		"\u0137\2\2\u02a1\u02a3\3\2\2\2\u02a2\u029f\3\2\2\2\u02a2\u02a3\3\2\2\2"+
		"\u02a3\u02a4\3\2\2\2\u02a4\u02a5\5.\30\2\u02a5\u0085\3\2\2\2\u02a6\u02a9"+
		"\5.\30\2\u02a7\u02a8\7\u012a\2\2\u02a8\u02aa\5\u0084C\2\u02a9\u02a7\3"+
		"\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02b5\3\2\2\2\u02ad\u02b0\5.\30\2\u02ae\u02af\7\u012b\2\2\u02af\u02b1"+
		"\5.\30\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02a6\3\2\2\2\u02b4\u02ad\3\2"+
		"\2\2\u02b5\u0087\3\2\2\2\u02b6\u02b7\7\u013b\2\2\u02b7\u02bc\5\\/\2\u02b8"+
		"\u02b9\7\u0138\2\2\u02b9\u02bb\5\\/\2\u02ba\u02b8\3\2\2\2\u02bb\u02be"+
		"\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be"+
		"\u02bc\3\2\2\2\u02bf\u02c0\7\u013a\2\2\u02c0\u0089\3\2\2\2\u02c1\u02c2"+
		"\7\u0105\2\2\u02c2\u02c3\5\\/\2\u02c3\u02c4\5\f\7\2\u02c4\u008b\3\2\2"+
		"\2\u02c5\u02ca\5\u008eH\2\u02c6\u02c7\7\u0138\2\2\u02c7\u02c9\5\u008e"+
		"H\2\u02c8\u02c6\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u008d\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\5\u0090"+
		"I\2\u02ce\u02d0\5\u0096L\2\u02cf\u02cd\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0"+
		"\u008f\3\2\2\2\u02d1\u02e2\5\u0092J\2\u02d2\u02d4\7\u00c2\2\2\u02d3\u02d2"+
		"\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d7\t\22\2\2"+
		"\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02da"+
		"\7\27\2\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2\2"+
		"\u02db\u02dc\7\32\2\2\u02dc\u02de\5\u0096L\2\u02dd\u02df\5\u0098M\2\u02de"+
		"\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02d3\3\2"+
		"\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u0091\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02f0\5\u0094K\2\u02e6\u02e8"+
		"\t\22\2\2\u02e7\u02e9\7\27\2\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2"+
		"\u02e9\u02ea\3\2\2\2\u02ea\u02eb\7\32\2\2\u02eb\u02ec\5\u0094K\2\u02ec"+
		"\u02ed\5\u0098M\2\u02ed\u02ef\3\2\2\2\u02ee\u02e6\3\2\2\2\u02ef\u02f2"+
		"\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u0093\3\2\2\2\u02f2"+
		"\u02f0\3\2\2\2\u02f3\u02f5\5\u0096L\2\u02f4\u02f6\5L\'\2\u02f5\u02f4\3"+
		"\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02ff\3\2\2\2\u02f7\u02f9\t\22\2\2\u02f8"+
		"\u02fa\7\27\2\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3"+
		"\2\2\2\u02fb\u02f7\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"\u02fe\7\32\2\2\u02fe\u0300\5\u0096L\2\u02ff\u02fb\3\2\2\2\u02ff\u0300"+
		"\3\2\2\2\u0300\u0095\3\2\2\2\u0301\u0303\5\u00c8e\2\u0302\u0304\5L\'\2"+
		"\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u030f\3\2\2\2\u0305\u0307"+
		"\5\u00c6d\2\u0306\u0308\5L\'\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2"+
		"\u0308\u030f\3\2\2\2\u0309\u030a\7\u013b\2\2\u030a\u030b\5\u008cG\2\u030b"+
		"\u030c\7\u013a\2\2\u030c\u030f\3\2\2\2\u030d\u030f\7\u014e\2\2\u030e\u0301"+
		"\3\2\2\2\u030e\u0305\3\2\2\2\u030e\u0309\3\2\2\2\u030e\u030d\3\2\2\2\u030f"+
		"\u0097\3\2\2\2\u0310\u0311\7\36\2\2\u0311\u0312\5\\/\2\u0312\u0099\3\2"+
		"\2\2\u0313\u0318\5\u009eP\2\u0314\u0315\7\u0138\2\2\u0315\u0317\5\u009e"+
		"P\2\u0316\u0314\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u009b\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u0324\t\23"+
		"\2\2\u031c\u0322\7\u00d8\2\2\u031d\u0323\7\32\2\2\u031e\u031f\7\f\2\2"+
		"\u031f\u0323\7\16\2\2\u0320\u0321\7\r\2\2\u0321\u0323\7\16\2\2\u0322\u031d"+
		"\3\2\2\2\u0322\u031e\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0325\3\2\2\2\u0324"+
		"\u031c\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u009d\3\2\2\2\u0326\u0327\7\u00ce"+
		"\2\2\u0327\u0328\5\u009cO\2\u0328\u032a\7\u013b\2\2\u0329\u032b\5\u00a0"+
		"Q\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u032d\7\u013a\2\2\u032d\u0335\3\2\2\2\u032e\u032f\7D\2\2\u032f\u0330"+
		"\5\u009cO\2\u0330\u0331\7\u013b\2\2\u0331\u0332\5\u00a0Q\2\u0332\u0333"+
		"\7\u013a\2\2\u0333\u0335\3\2\2\2\u0334\u0326\3\2\2\2\u0334\u032e\3\2\2"+
		"\2\u0335\u009f\3\2\2\2\u0336\u033b\5\64\33\2\u0337\u0338\7\u0138\2\2\u0338"+
		"\u033a\5\64\33\2\u0339\u0337\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3"+
		"\2\2\2\u033b\u033c\3\2\2\2\u033c\u00a1\3\2\2\2\u033d\u033b\3\2\2\2\u033e"+
		"\u033f\7\37\2\2\u033f\u0340\7\u013b\2\2\u0340\u0341\5\u00a4S\2\u0341\u0342"+
		"\7\u013a\2\2\u0342\u00a3\3\2\2\2\u0343\u0348\5\66\34\2\u0344\u0345\7\u0138"+
		"\2\2\u0345\u0347\5\66\34\2\u0346\u0344\3\2\2\2\u0347\u034a\3\2\2\2\u0348"+
		"\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u00a5\3\2\2\2\u034a\u0348\3\2"+
		"\2\2\u034b\u034e\5\u00a8U\2\u034c\u034e\5\u00aaV\2\u034d\u034b\3\2\2\2"+
		"\u034d\u034c\3\2\2\2\u034e\u0350\3\2\2\2\u034f\u0351\7\u0135\2\2\u0350"+
		"\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u00a7\3\2\2\2\u0352\u0358\5\u00ac"+
		"W\2\u0353\u0358\5\u012c\u0097\2\u0354\u0358\5\u00ccg\2\u0355\u0358\5\u012a"+
		"\u0096\2\u0356\u0358\5\u0128\u0095\2\u0357\u0352\3\2\2\2\u0357\u0353\3"+
		"\2\2\2\u0357\u0354\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0356\3\2\2\2\u0358"+
		"\u00a9\3\2\2\2\u0359\u0369\5\u00dco\2\u035a\u0369\5\u00dep\2\u035b\u0369"+
		"\5\u0116\u008c\2\u035c\u0369\5\u0118\u008d\2\u035d\u0369\5\u011a\u008e"+
		"\2\u035e\u0369\5\u011e\u0090\2\u035f\u0369\5\u0120\u0091\2\u0360\u0369"+
		"\5\u0124\u0093\2\u0361\u0369\5\u00e0q\2\u0362\u0369\5\u00fc\177\2\u0363"+
		"\u0369\5\u010a\u0086\2\u0364\u0369\5\u010c\u0087\2\u0365\u0369\5\u0110"+
		"\u0089\2\u0366\u0369\5\u0114\u008b\2\u0367\u0369\5\u0126\u0094\2\u0368"+
		"\u0359\3\2\2\2\u0368\u035a\3\2\2\2\u0368\u035b\3\2\2\2\u0368\u035c\3\2"+
		"\2\2\u0368\u035d\3\2\2\2\u0368\u035e\3\2\2\2\u0368\u035f\3\2\2\2\u0368"+
		"\u0360\3\2\2\2\u0368\u0361\3\2\2\2\u0368\u0362\3\2\2\2\u0368\u0363\3\2"+
		"\2\2\u0368\u0364\3\2\2\2\u0368\u0365\3\2\2\2\u0368\u0366\3\2\2\2\u0368"+
		"\u0367\3\2\2\2\u0369\u00ab\3\2\2\2\u036a\u0372\5\u00aeX\2\u036b\u036d"+
		"\7\62\2\2\u036c\u036e\t\24\2\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2"+
		"\u036e\u036f\3\2\2\2\u036f\u0371\5\u00aeX\2\u0370\u036b\3\2\2\2\u0371"+
		"\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u00ad\3\2"+
		"\2\2\u0374\u0372\3\2\2\2\u0375\u0377\7\23\2\2\u0376\u0378\t\24\2\2\u0377"+
		"\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u0385\5\u00c2"+
		"b\2\u037a\u037b\7\21\2\2\u037b\u037d\5\u008cG\2\u037c\u037e\5\u00b0Y\2"+
		"\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0380\3\2\2\2\u037f\u0381"+
		"\5\u00b2Z\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\3\2\2"+
		"\2\u0382\u0384\5\u00b6\\\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384"+
		"\u0386\3\2\2\2\u0385\u037a\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2"+
		"\2\2\u0387\u0389\5\u00b8]\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389"+
		"\u038b\3\2\2\2\u038a\u038c\5\u00bc_\2\u038b\u038a\3\2\2\2\u038b\u038c"+
		"\3\2\2\2\u038c\u00af\3\2\2\2\u038d\u038e\7\20\2\2\u038e\u038f\5\\/\2\u038f"+
		"\u00b1\3\2\2\2\u0390\u0391\7\r\2\2\u0391\u0392\7\16\2\2\u0392\u0397\5"+
		"\u00b4[\2\u0393\u0394\7\u0138\2\2\u0394\u0396\5\u00b4[\2\u0395\u0393\3"+
		"\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398"+
		"\u039c\3\2\2\2\u0399\u0397\3\2\2\2\u039a\u039b\7\u008f\2\2\u039b\u039d"+
		"\7\u00d5\2\2\u039c\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u00b3\3\2\2"+
		"\2\u039e\u03a2\5\u0084C\2\u039f\u03a2\7\u0147\2\2\u03a0\u03a2\5j\66\2"+
		"\u03a1\u039e\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a0\3\2\2\2\u03a2\u00b5"+
		"\3\2\2\2\u03a3\u03a4\7\17\2\2\u03a4\u03a5\5\\/\2\u03a5\u00b7\3\2\2\2\u03a6"+
		"\u03a7\7\f\2\2\u03a7\u03a8\7\16\2\2\u03a8\u03ad\5\u00ba^\2\u03a9\u03aa"+
		"\7\u0138\2\2\u03aa\u03ac\5\u00ba^\2\u03ab\u03a9\3\2\2\2\u03ac\u03af\3"+
		"\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u00b9\3\2\2\2\u03af"+
		"\u03ad\3\2\2\2\u03b0\u03b2\5\u00b4[\2\u03b1\u03b3\t\25\2\2\u03b2\u03b1"+
		"\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u00bb\3\2\2\2\u03b4\u03b8\7\u0093\2"+
		"\2\u03b5\u03b6\5\u00be`\2\u03b6\u03b7\7\u0138\2\2\u03b7\u03b9\3\2\2\2"+
		"\u03b8\u03b5\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb"+
		"\5\u00c0a\2\u03bb\u00bd\3\2\2\2\u03bc\u03bd\7\u0147\2\2\u03bd\u00bf\3"+
		"\2\2\2\u03be\u03bf\7\u0147\2\2\u03bf\u00c1\3\2\2\2\u03c0\u03c5\5\u00ca"+
		"f\2\u03c1\u03c2\7\u0138\2\2\u03c2\u03c4\5\u00caf\2\u03c3\u03c1\3\2\2\2"+
		"\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u00c3"+
		"\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03c9\7\u013b\2\2\u03c9\u03ce\5\u0084"+
		"C\2\u03ca\u03cb\7\u0138\2\2\u03cb\u03cd\5\u0084C\2\u03cc\u03ca\3\2\2\2"+
		"\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1"+
		"\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d2\7\u013a\2\2\u03d2\u00c5\3\2\2"+
		"\2\u03d3\u03d4\7\u013b\2\2\u03d4\u03d5\5\u00acW\2\u03d5\u03d6\7\u013a"+
		"\2\2\u03d6\u00c7\3\2\2\2\u03d7\u03d8\5&\24\2\u03d8\u03d9\7\u0137\2\2\u03d9"+
		"\u03db\3\2\2\2\u03da\u03d7\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dc\u03dd\5*\26\2\u03dd\u00c9\3\2\2\2\u03de\u03ec\7\u0139\2\2\u03df"+
		"\u03e0\5\u00c8e\2\u03e0\u03e1\7\u0137\2\2\u03e1\u03e2\7\u0139\2\2\u03e2"+
		"\u03ec\3\2\2\2\u03e3\u03e5\5\u0084C\2\u03e4\u03e6\5L\'\2\u03e5\u03e4\3"+
		"\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03ec\3\2\2\2\u03e7\u03e9\5j\66\2\u03e8"+
		"\u03ea\5L\'\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2"+
		"\2\2\u03eb\u03de\3\2\2\2\u03eb\u03df\3\2\2\2\u03eb\u03e3\3\2\2\2\u03eb"+
		"\u03e7\3\2\2\2\u03ec\u00cb\3\2\2\2\u03ed\u03ee\5\u00d2j\2\u03ee\u00cd"+
		"\3\2\2\2\u03ef\u03f1\7\25\2\2\u03f0\u03f2\t\26\2\2\u03f1\u03f0\3\2\2\2"+
		"\u03f1\u03f2\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03f5\7D\2\2\u03f4\u03f3"+
		"\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f8\7]\2\2\u03f7"+
		"\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\5\u00c8"+
		"e\2\u03fa\u03fc\5\u00a2R\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u00cf\3\2\2\2\u03fd\u03fe\7\36\2\2\u03fe\u03ff\7\u0117\2\2\u03ff\u0400"+
		"\7i\2\2\u0400\u0401\7\u00d1\2\2\u0401\u0402\5\u0084C\2\u0402\u0403\7\u012e"+
		"\2\2\u0403\u040b\5\\/\2\u0404\u0405\7\u0138\2\2\u0405\u0406\5\u0084C\2"+
		"\u0406\u0407\7\u012e\2\2\u0407\u0408\5\\/\2\u0408\u040a\3\2\2\2\u0409"+
		"\u0404\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2"+
		"\2\2\u040c\u00d1\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u0410\5\u00ceh\2\u040f"+
		"\u0411\5\u00c4c\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0414"+
		"\3\2\2\2\u0412\u0415\5\u00aeX\2\u0413\u0415\5\u00d4k\2\u0414\u0412\3\2"+
		"\2\2\u0414\u0413\3\2\2\2\u0415\u0417\3\2\2\2\u0416\u0418\5\u00d0i\2\u0417"+
		"\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u00d3\3\2\2\2\u0419\u041a\t\27"+
		"\2\2\u041a\u041f\5\u00d6l\2\u041b\u041c\7\u0138\2\2\u041c\u041e\5\u00d6"+
		"l\2\u041d\u041b\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u00d5\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0425\7\u013b"+
		"\2\2\u0423\u0426\5j\66\2\u0424\u0426\7w\2\2\u0425\u0423\3\2\2\2\u0425"+
		"\u0424\3\2\2\2\u0426\u042e\3\2\2\2\u0427\u042a\7\u0138\2\2\u0428\u042b"+
		"\5j\66\2\u0429\u042b\7w\2\2\u042a\u0428\3\2\2\2\u042a\u0429\3\2\2\2\u042b"+
		"\u042d\3\2\2\2\u042c\u0427\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2"+
		"\2\2\u042e\u042f\3\2\2\2\u042f\u0431\3\2\2\2\u0430\u042e\3\2\2\2\u0431"+
		"\u0432\7\u013a\2\2\u0432\u00d7\3\2\2\2\u0433\u0434\7\u0094\2\2\u0434\u0439"+
		"\5\u00dan\2\u0435\u0436\7\u0138\2\2\u0436\u0438\5\u00dan\2\u0437\u0435"+
		"\3\2\2\2\u0438\u043b\3\2\2\2\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a"+
		"\u00d9\3\2\2\2\u043b\u0439\3\2\2\2\u043c\u043d\5\u0084C\2\u043d\u0440"+
		"\7\u012e\2\2\u043e\u0441\5\\/\2\u043f\u0441\7w\2\2\u0440\u043e\3\2\2\2"+
		"\u0440\u043f\3\2\2\2\u0441\u00db\3\2\2\2\u0442\u0443\7:\2\2\u0443\u0447"+
		"\t\30\2\2\u0444\u0445\7\b\2\2\u0445\u0446\7\6\2\2\u0446\u0448\7\t\2\2"+
		"\u0447\u0444\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a"+
		"\5&\24\2\u044a\u00dd\3\2\2\2\u044b\u044c\7B\2\2\u044c\u044f\t\30\2\2\u044d"+
		"\u044e\7\b\2\2\u044e\u0450\7\t\2\2\u044f\u044d\3\2\2\2\u044f\u0450\3\2"+
		"\2\2\u0450\u0451\3\2\2\2\u0451\u0452\5&\24\2\u0452\u00df\3\2\2\2\u0453"+
		"\u0457\5\u00e2r\2\u0454\u0457\5\u00e4s\2\u0455\u0457\5\u00e6t\2\u0456"+
		"\u0453\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0455\3\2\2\2\u0457\u00e1\3\2"+
		"\2\2\u0458\u045a\7:\2\2\u0459\u045b\7\u0085\2\2\u045a\u0459\3\2\2\2\u045a"+
		"\u045b\3\2\2\2\u045b\u045d\3\2\2\2\u045c\u045e\7;\2\2\u045d\u045c\3\2"+
		"\2\2\u045d\u045e\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0463\7!\2\2\u0460"+
		"\u0461\7\b\2\2\u0461\u0462\7\6\2\2\u0462\u0464\7\t\2\2\u0463\u0460\3\2"+
		"\2\2\u0463\u0464\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0471\5\u00c8e\2\u0466"+
		"\u0467\7\u013b\2\2\u0467\u046c\5\u00e8u\2\u0468\u0469\7\u0138\2\2\u0469"+
		"\u046b\5\u00e8u\2\u046a\u0468\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046a"+
		"\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f\3\2\2\2\u046e\u046c\3\2\2\2\u046f"+
		"\u0470\7\u013a\2\2\u0470\u0472\3\2\2\2\u0471\u0466\3\2\2\2\u0471\u0472"+
		"\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0474\7G\2\2\u0474\u0476\7\u014d\2"+
		"\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0479\3\2\2\2\u0477\u0478"+
		"\7\22\2\2\u0478\u047a\5\u00acW\2\u0479\u0477\3\2\2\2\u0479\u047a\3\2\2"+
		"\2\u047a\u00e3\3\2\2\2\u047b\u047d\7:\2\2\u047c\u047e\7\u0085\2\2\u047d"+
		"\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0480\3\2\2\2\u047f\u0481\7;"+
		"\2\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482"+
		"\u0486\7!\2\2\u0483\u0484\7\b\2\2\u0484\u0485\7\6\2\2\u0485\u0487\7\t"+
		"\2\2\u0486\u0483\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\3\2\2\2\u0488"+
		"\u0489\5\u00c8e\2\u0489\u048a\7\22\2\2\u048a\u048b\5\u00acW\2\u048b\u00e5"+
		"\3\2\2\2\u048c\u048e\7:\2\2\u048d\u048f\7\u0085\2\2\u048e\u048d\3\2\2"+
		"\2\u048e\u048f\3\2\2\2\u048f\u0491\3\2\2\2\u0490\u0492\7;\2\2\u0491\u0490"+
		"\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0497\7!\2\2\u0494"+
		"\u0495\7\b\2\2\u0495\u0496\7\6\2\2\u0496\u0498\7\t\2\2\u0497\u0494\3\2"+
		"\2\2\u0497\u0498\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u04a1\5\u00c8e\2\u049a"+
		"\u049b\7\7\2\2\u049b\u04a2\5\u00c8e\2\u049c\u049d\7\u013b\2\2\u049d\u049e"+
		"\7\7\2\2\u049e\u049f\5\u00c8e\2\u049f\u04a0\7\u013a\2\2\u04a0\u04a2\3"+
		"\2\2\2\u04a1\u049a\3\2\2\2\u04a1\u049c\3\2\2\2\u04a2\u00e7\3\2\2\2\u04a3"+
		"\u04a4\5.\30\2\u04a4\u04a5\5\u00eav\2\u04a5\u04be\3\2\2\2\u04a6\u04a8"+
		"\t\23\2\2\u04a7\u04a9\5\64\33\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2"+
		"\2\u04a9\u04ab\3\2\2\2\u04aa\u04ac\5\u0102\u0082\2\u04ab\u04aa\3\2\2\2"+
		"\u04ab\u04ac\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\7\u013b\2\2\u04ae"+
		"\u04b3\5\u00f0y\2\u04af\u04b0\7\u0138\2\2\u04b0\u04b2\5\u00f0y\2\u04b1"+
		"\u04af\3\2\2\2\u04b2\u04b5\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b3\u04b4\3\2"+
		"\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b6\u04ba\7\u013a\2\2\u04b7"+
		"\u04b9\5\u0104\u0083\2\u04b8\u04b7\3\2\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8"+
		"\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04be\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd"+
		"\u04a3\3\2\2\2\u04bd\u04a6\3\2\2\2\u04be\u00e9\3\2\2\2\u04bf\u04c2\5\u00ee"+
		"x\2\u04c0\u04c1\7G\2\2\u04c1\u04c3\7\u014d\2\2\u04c2\u04c0\3\2\2\2\u04c2"+
		"\u04c3\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04c6\5\u00f2z\2\u04c5\u04c4"+
		"\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u00eb\3\2\2\2\u04c7\u04c8\7\6\2\2\u04c8"+
		"\u04cb\79\2\2\u04c9\u04cb\79\2\2\u04ca\u04c7\3\2\2\2\u04ca\u04c9\3\2\2"+
		"\2\u04cb\u00ed\3\2\2\2\u04cc\u04d1\7I\2\2\u04cd\u04ce\7\u013b\2\2\u04ce"+
		"\u04cf\5\u00f6|\2\u04cf\u04d0\7\u013a\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04cd"+
		"\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d5\7\u00b7\2"+
		"\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04d8"+
		"\5\u00ecw\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04db\3\2\2"+
		"\2\u04d9\u04da\7w\2\2\u04da\u04dc\5\20\t\2\u04db\u04d9\3\2\2\2\u04db\u04dc"+
		"\3\2\2\2\u04dc\u0585\3\2\2\2\u04dd\u04e2\7J\2\2\u04de\u04df\7\u013b\2"+
		"\2\u04df\u04e0\5\u00f6|\2\u04e0\u04e1\7\u013a\2\2\u04e1\u04e3\3\2\2\2"+
		"\u04e2\u04de\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5\3\2\2\2\u04e4\u04e6"+
		"\7\u00b7\2\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e8\3\2\2"+
		"\2\u04e7\u04e9\5\u00ecw\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04ec\3\2\2\2\u04ea\u04eb\7w\2\2\u04eb\u04ed\5\20\t\2\u04ec\u04ea\3\2"+
		"\2\2\u04ec\u04ed\3\2\2\2\u04ed\u0585\3\2\2\2\u04ee\u04f3\7K\2\2\u04ef"+
		"\u04f0\7\u013b\2\2\u04f0\u04f1\5\u00f6|\2\u04f1\u04f2\7\u013a\2\2\u04f2"+
		"\u04f4\3\2\2\2\u04f3\u04ef\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f6\3\2"+
		"\2\2\u04f5\u04f7\7\u00b7\2\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"\u04f9\3\2\2\2\u04f8\u04fa\5\u00ecw\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa"+
		"\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04fc\7w\2\2\u04fc\u04fe\5\20\t\2\u04fd"+
		"\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0585\3\2\2\2\u04ff\u0504\7L"+
		"\2\2\u0500\u0501\7\u013b\2\2\u0501\u0502\5\u00f6|\2\u0502\u0503\7\u013a"+
		"\2\2\u0503\u0505\3\2\2\2\u0504\u0500\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u0507\3\2\2\2\u0506\u0508\7\u00b7\2\2\u0507\u0506\3\2\2\2\u0507\u0508"+
		"\3\2\2\2\u0508\u050a\3\2\2\2\u0509\u050b\5\u00ecw\2\u050a\u0509\3\2\2"+
		"\2\u050a\u050b\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050d\7w\2\2\u050d\u050f"+
		"\5\20\t\2\u050e\u050c\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0585\3\2\2\2"+
		"\u0510\u0517\7N\2\2\u0511\u0512\7\u013b\2\2\u0512\u0513\5\u00f6|\2\u0513"+
		"\u0514\7\u0138\2\2\u0514\u0515\5\20\t\2\u0515\u0516\7\u013a\2\2\u0516"+
		"\u0518\3\2\2\2\u0517\u0511\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2"+
		"\2\2\u0519\u051b\7\u00b7\2\2\u051a\u0519\3\2\2\2\u051a\u051b\3\2\2\2\u051b"+
		"\u051d\3\2\2\2\u051c\u051e\5\u00ecw\2\u051d\u051c\3\2\2\2\u051d\u051e"+
		"\3\2\2\2\u051e\u0521\3\2\2\2\u051f\u0520\7w\2\2\u0520\u0522\5\20\t\2\u0521"+
		"\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0585\3\2\2\2\u0523\u052a\7M"+
		"\2\2\u0524\u0525\7\u013b\2\2\u0525\u0526\5\u00f6|\2\u0526\u0527\7\u0138"+
		"\2\2\u0527\u0528\5\20\t\2\u0528\u0529\7\u013a\2\2\u0529\u052b\3\2\2\2"+
		"\u052a\u0524\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052d\3\2\2\2\u052c\u052e"+
		"\7\u00b7\2\2\u052d\u052c\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0530\3\2\2"+
		"\2\u052f\u0531\5\u00ecw\2\u0530\u052f\3\2\2\2\u0530\u0531\3\2\2\2\u0531"+
		"\u0534\3\2\2\2\u0532\u0533\7w\2\2\u0533\u0535\5\20\t\2\u0534\u0532\3\2"+
		"\2\2\u0534\u0535\3\2\2\2\u0535\u0585\3\2\2\2\u0536\u053f\7R\2\2\u0537"+
		"\u0538\7\u013b\2\2\u0538\u053b\5\u00f6|\2\u0539\u053a\7\u0138\2\2\u053a"+
		"\u053c\5\20\t\2\u053b\u0539\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\3"+
		"\2\2\2\u053d\u053e\7\u013a\2\2\u053e\u0540\3\2\2\2\u053f\u0537\3\2\2\2"+
		"\u053f\u0540\3\2\2\2\u0540\u0542\3\2\2\2\u0541\u0543\7\u00b7\2\2\u0542"+
		"\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0545\3\2\2\2\u0544\u0546\5\u00ec"+
		"w\2\u0545\u0544\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0549\3\2\2\2\u0547"+
		"\u0548\7w\2\2\u0548\u054a\5\20\t\2\u0549\u0547\3\2\2\2\u0549\u054a\3\2"+
		"\2\2\u054a\u0585\3\2\2\2\u054b\u054d\7O\2\2\u054c\u054e\5\u00ecw\2\u054d"+
		"\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0551\3\2\2\2\u054f\u0550\7w"+
		"\2\2\u0550\u0552\7\u014d\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552"+
		"\u0585\3\2\2\2\u0553\u0555\7Q\2\2\u0554\u0556\5\u00ecw\2\u0555\u0554\3"+
		"\2\2\2\u0555\u0556\3\2\2\2\u0556\u0559\3\2\2\2\u0557\u0558\7w\2\2\u0558"+
		"\u055a\7\u014d\2\2\u0559\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u0585"+
		"\3\2\2\2\u055b\u055d\7P\2\2\u055c\u055e\5\u00ecw\2\u055d\u055c\3\2\2\2"+
		"\u055d\u055e\3\2\2\2\u055e\u0561\3\2\2\2\u055f\u0560\7w\2\2\u0560\u0562"+
		"\7\u014d\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0585\3\2\2"+
		"\2\u0563\u0564\7T\2\2\u0564\u0565\7\u013b\2\2\u0565\u0566\5\u00f8}\2\u0566"+
		"\u0568\7\u013a\2\2\u0567\u0569\5\u00ecw\2\u0568\u0567\3\2\2\2\u0568\u0569"+
		"\3\2\2\2\u0569\u056c\3\2\2\2\u056a\u056b\7w\2\2\u056b\u056d\7\u014d\2"+
		"\2\u056c\u056a\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u0585\3\2\2\2\u056e\u0573"+
		"\7\u00c1\2\2\u056f\u0570\7\u013b\2\2\u0570\u0571\5\u00fa~\2\u0571\u0572"+
		"\7\u013a\2\2\u0572\u0574\3\2\2\2\u0573\u056f\3\2\2\2\u0573\u0574\3\2\2"+
		"\2\u0574\u0576\3\2\2\2\u0575\u0577\5\u00ecw\2\u0576\u0575\3\2\2\2\u0576"+
		"\u0577\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0579\7w\2\2\u0579\u057b\7\u014d"+
		"\2\2\u057a\u0578\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u0585\3\2\2\2\u057c"+
		"\u057e\7H\2\2\u057d\u057f\5\u00ecw\2\u057e\u057d\3\2\2\2\u057e\u057f\3"+
		"\2\2\2\u057f\u0582\3\2\2\2\u0580\u0581\7w\2\2\u0581\u0583\7\u014d\2\2"+
		"\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u04cc"+
		"\3\2\2\2\u0584\u04dd\3\2\2\2\u0584\u04ee\3\2\2\2\u0584\u04ff\3\2\2\2\u0584"+
		"\u0510\3\2\2\2\u0584\u0523\3\2\2\2\u0584\u0536\3\2\2\2\u0584\u054b\3\2"+
		"\2\2\u0584\u0553\3\2\2\2\u0584\u055b\3\2\2\2\u0584\u0563\3\2\2\2\u0584"+
		"\u056e\3\2\2\2\u0584\u057c\3\2\2\2\u0585\u00ef\3\2\2\2\u0586\u058a\5."+
		"\30\2\u0587\u0588\7\u013b\2\2\u0588\u0589\7\u0147\2\2\u0589\u058b\7\u013a"+
		"\2\2\u058a\u0587\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c"+
		"\u058e\t\25\2\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u00f1\3"+
		"\2\2\2\u058f\u0590\7\u0120\2\2\u0590\u0591\5\u00c8e\2\u0591\u0592\7\u013b"+
		"\2\2\u0592\u0597\5\u00f0y\2\u0593\u0594\7\u0138\2\2\u0594\u0596\5\u00f0"+
		"y\2\u0595\u0593\3\2\2\2\u0596\u0599\3\2\2\2\u0597\u0595\3\2\2\2\u0597"+
		"\u0598\3\2\2\2\u0598\u059a\3\2\2\2\u0599\u0597\3\2\2\2\u059a\u059e\7\u013a"+
		"\2\2\u059b\u059c\7\36\2\2\u059c\u059d\7\u00a3\2\2\u059d\u059f\5\u00f4"+
		"{\2\u059e\u059b\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a3\3\2\2\2\u05a0"+
		"\u05a1\7\36\2\2\u05a1\u05a2\7\u00d1\2\2\u05a2\u05a4\5\u00f4{\2\u05a3\u05a0"+
		"\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u00f3\3\2\2\2\u05a5\u05aa\7\u00d2\2"+
		"\2\u05a6\u05aa\7\u00d3\2\2\u05a7\u05a8\7\u0094\2\2\u05a8\u05aa\79\2\2"+
		"\u05a9\u05a5\3\2\2\2\u05a9\u05a6\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa\u00f5"+
		"\3\2\2\2\u05ab\u05ac\7\u0147\2\2\u05ac\u00f7\3\2\2\2\u05ad\u05ae\7\u0147"+
		"\2\2\u05ae\u00f9\3\2\2\2\u05af\u05b0\7\u0147\2\2\u05b0\u00fb\3\2\2\2\u05b1"+
		"\u05b2\7<\2\2\u05b2\u05b3\7!\2\2\u05b3\u05bc\5\u00c8e\2\u05b4\u05b9\5"+
		"\u00fe\u0080\2\u05b5\u05b6\7\u0138\2\2\u05b6\u05b8\5\u00fe\u0080\2\u05b7"+
		"\u05b5\3\2\2\2\u05b8\u05bb\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2"+
		"\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bc\u05b4\3\2\2\2\u05bc"+
		"\u05bd\3\2\2\2\u05bd\u00fd\3\2\2\2\u05be\u05bf\7C\2\2\u05bf\u05c0\7F\2"+
		"\2\u05c0\u05c9\5\u00c8e\2\u05c1\u05c3\7=\2\2\u05c2\u05c4\7>\2\2\u05c3"+
		"\u05c2\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\5."+
		"\30\2\u05c6\u05c7\5.\30\2\u05c7\u05c9\3\2\2\2\u05c8\u05be\3\2\2\2\u05c8"+
		"\u05c1\3\2\2\2\u05c9\u00ff\3\2\2\2\u05ca\u05cf\5\u00f0y\2\u05cb\u05cc"+
		"\7\u0138\2\2\u05cc\u05ce\5\u00f0y\2\u05cd\u05cb\3\2\2\2\u05ce\u05d1\3"+
		"\2\2\2\u05cf\u05cd\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u0101\3\2\2\2\u05d1"+
		"\u05cf\3\2\2\2\u05d2\u05d3\7.\2\2\u05d3\u05d4\7\u011f\2\2\u05d4\u0103"+
		"\3\2\2\2\u05d5\u05d9\5\u0102\u0082\2\u05d6\u05d7\7G\2\2\u05d7\u05d9\7"+
		"\u014d\2\2\u05d8\u05d5\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d9\u0105\3\2\2\2"+
		"\u05da\u05db\5.\30\2\u05db\u05e2\5\u00eav\2\u05dc\u05dd\7\u0138\2\2\u05dd"+
		"\u05de\5.\30\2\u05de\u05df\5\u00eav\2\u05df\u05e1\3\2\2\2\u05e0\u05dc"+
		"\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3"+
		"\u0107\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e5\u05e6\7C\2\2\u05e6\u05e7\7!\2"+
		"\2\u05e7\u05e8\5\u00c8e\2\u05e8\u05e9\7F\2\2\u05e9\u05f1\5\u00c8e\2\u05ea"+
		"\u05eb\7\u0138\2\2\u05eb\u05ec\5\u00c8e\2\u05ec\u05ed\7F\2\2\u05ed\u05ee"+
		"\5\u00c8e\2\u05ee\u05f0\3\2\2\2\u05ef\u05ea\3\2\2\2\u05f0\u05f3\3\2\2"+
		"\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u0109\3\2\2\2\u05f3\u05f1"+
		"\3\2\2\2\u05f4\u05f5\7B\2\2\u05f5\u05f8\7!\2\2\u05f6\u05f7\7\b\2\2\u05f7"+
		"\u05f9\7\t\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa\3\2"+
		"\2\2\u05fa\u05fb\5\u00c8e\2\u05fb\u010b\3\2\2\2\u05fc\u05fd\7B\2\2\u05fd"+
		"\u0600\7\u00a6\2\2\u05fe\u05ff\7\b\2\2\u05ff\u0601\7\t\2\2\u0600\u05fe"+
		"\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603\5\u00c8e"+
		"\2\u0603\u010d\3\2\2\2\u0604\u0606\7\u00e3\2\2\u0605\u0607\7!\2\2\u0606"+
		"\u0605\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0609\5\u00c8"+
		"e\2\u0609\u010f\3\2\2\2\u060a\u060b\7:\2\2\u060b\u060c\5\u0112\u008a\2"+
		"\u060c\u0111\3\2\2\2\u060d\u0611\7\u00a6\2\2\u060e\u060f\5(\25\2\u060f"+
		"\u0610\7\u0137\2\2\u0610\u0612\3\2\2\2\u0611\u060e\3\2\2\2\u0611\u0612"+
		"\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0617\5\60\31\2\u0614\u0615\7\b\2\2"+
		"\u0615\u0616\7\6\2\2\u0616\u0618\7\t\2\2\u0617\u0614\3\2\2\2\u0617\u0618"+
		"\3\2\2\2\u0618\u061a\3\2\2\2\u0619\u061b\5\u00c4c\2\u061a\u0619\3\2\2"+
		"\2\u061a\u061b\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d\7\22\2\2\u061d"+
		"\u061e\5\u00acW\2\u061e\u0113\3\2\2\2\u061f\u0620\7<\2\2\u0620\u0621\5"+
		"\u0112\u008a\2\u0621\u0115\3\2\2\2\u0622\u0623\7:\2\2\u0623\u0624\7\u00e6"+
		"\2\2\u0624\u0625\5B\"\2\u0625\u0626\7\u00ea\2\2\u0626\u0627\7\16\2\2\u0627"+
		"\u0628\7\u014d\2\2\u0628\u0117\3\2\2\2\u0629\u062a\7B\2\2\u062a\u062b"+
		"\7\u00e6\2\2\u062b\u062c\5B\"\2\u062c\u0119\3\2\2\2\u062d\u062e\7\u00ad"+
		"\2\2\u062e\u0633\5Z.\2\u062f\u0630\7\u0138\2\2\u0630\u0632\5Z.\2\u0631"+
		"\u062f\3\2\2\2\u0632\u0635\3\2\2\2\u0633\u0631\3\2\2\2\u0633\u0634\3\2"+
		"\2\2\u0634\u0636\3\2\2\2\u0635\u0633\3\2\2\2\u0636\u0639\7\36\2\2\u0637"+
		"\u063a\5\u00c8e\2\u0638\u063a\5\60\31\2\u0639\u0637\3\2\2\2\u0639\u0638"+
		"\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063c\7F\2\2\u063c\u0641\5\u011c\u008f"+
		"\2\u063d\u063e\7\u0138\2\2\u063e\u0640\5\u011c\u008f\2\u063f\u063d\3\2"+
		"\2\2\u0640\u0643\3\2\2\2\u0641\u063f\3\2\2\2\u0641\u0642\3\2\2\2\u0642"+
		"\u0647\3\2\2\2\u0643\u0641\3\2\2\2\u0644\u0645\7\u008f\2\2\u0645\u0646"+
		"\7\u00ad\2\2\u0646\u0648\7\u00cf\2\2\u0647\u0644\3\2\2\2\u0647\u0648\3"+
		"\2\2\2\u0648\u011b\3\2\2\2\u0649\u064b\7\u00e6\2\2\u064a\u0649\3\2\2\2"+
		"\u064a\u064b\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064d\5B\"\2\u064d\u011d"+
		"\3\2\2\2\u064e\u0652\7\u00ae\2\2\u064f\u0650\7\u00ad\2\2\u0650\u0651\7"+
		"\u00cf\2\2\u0651\u0653\7\u00d8\2\2\u0652\u064f\3\2\2\2\u0652\u0653\3\2"+
		"\2\2\u0653\u0654\3\2\2\2\u0654\u0659\5Z.\2\u0655\u0656\7\u0138\2\2\u0656"+
		"\u0658\5Z.\2\u0657\u0655\3\2\2\2\u0658\u065b\3\2\2\2\u0659\u0657\3\2\2"+
		"\2\u0659\u065a\3\2\2\2\u065a\u065c\3\2\2\2\u065b\u0659\3\2\2\2\u065c\u065f"+
		"\7\36\2\2\u065d\u0660\5\u00c8e\2\u065e\u0660\5\60\31\2\u065f\u065d\3\2"+
		"\2\2\u065f\u065e\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0662\7\21\2\2\u0662"+
		"\u0667\5\u011c\u008f\2\u0663\u0664\7\u0138\2\2\u0664\u0666\5\u011c\u008f"+
		"\2\u0665\u0663\3\2\2\2\u0666\u0669\3\2\2\2\u0667\u0665\3\2\2\2\u0667\u0668"+
		"\3\2\2\2\u0668\u011f\3\2\2\2\u0669\u0667\3\2\2\2\u066a\u066b\7(\2\2\u066b"+
		"\u066c\5\u0122\u0092\2\u066c\u0121\3\2\2\2\u066d\u066e\7:\2\2\u066e\u066f"+
		"\t\31\2\2\u066f\u0690\5\u00c8e\2\u0670\u0671\7#\2\2\u0671\u0672\7\21\2"+
		"\2\u0672\u0690\5\u00c8e\2\u0673\u0676\t\32\2\2\u0674\u0675\7\7\2\2\u0675"+
		"\u0677\7\u014d\2\2\u0676\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0690"+
		"\3\2\2\2\u0678\u0679\7\u0118\2\2\u0679\u0690\7\u0119\2\2\u067a\u067d\7"+
		"\"\2\2\u067b\u067c\7\u00a7\2\2\u067c\u067e\5(\25\2\u067d\u067b\3\2\2\2"+
		"\u067d\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u0681\7\u014d\2\2\u0680"+
		"\u067f\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0690\3\2\2\2\u0682\u0685\7\u00ad"+
		"\2\2\u0683\u0686\5V,\2\u0684\u0686\5\u011c\u008f\2\u0685\u0683\3\2\2\2"+
		"\u0685\u0684\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u068d"+
		"\7\36\2\2\u0688\u068e\7\5\2\2\u0689\u068b\7!\2\2\u068a\u0689\3\2\2\2\u068a"+
		"\u068b\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068e\5\u00c8e\2\u068d\u0688"+
		"\3\2\2\2\u068d\u068a\3\2\2\2\u068e\u0690\3\2\2\2\u068f\u066d\3\2\2\2\u068f"+
		"\u0670\3\2\2\2\u068f\u0673\3\2\2\2\u068f\u0678\3\2\2\2\u068f\u067a\3\2"+
		"\2\2\u068f\u0682\3\2\2\2\u0690\u0123\3\2\2\2\u0691\u0692\7\u0094\2\2\u0692"+
		"\u0693\7!\2\2\u0693\u0694\5\u00c8e\2\u0694\u0695\7F\2\2\u0695\u0696\5"+
		"P)\2\u0696\u0697\7\u0137\2\2\u0697\u0698\5(\25\2\u0698\u0125\3\2\2\2\u0699"+
		"\u069a\7\u00ce\2\2\u069a\u069b\5(\25\2\u069b\u0127\3\2\2\2\u069c\u069d"+
		"\7\u0118\2\2\u069d\u069e\7\u011a\2\2\u069e\u069f\5P)\2\u069f\u06a0\5\u00a6"+
		"T\2\u06a0\u0129\3\2\2\2\u06a1\u06a2\7\u00d1\2\2\u06a2\u06a3\5\u00c8e\2"+
		"\u06a3\u06a4\5\u00d8m\2\u06a4\u06a5\5\u00b0Y\2\u06a5\u012b\3\2\2\2\u06a6"+
		"\u06a7\7\u00a3\2\2\u06a7\u06a8\7\21\2\2\u06a8\u06aa\5\u00c8e\2\u06a9\u06ab"+
		"\5\u00b0Y\2\u06aa\u06a9\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u012d\3\2\2"+
		"\2\u00dd\u013f\u0145\u0149\u0152\u0155\u0159\u015d\u015f\u0166\u0176\u017c"+
		"\u01af\u01c1\u01ca\u01d2\u01da\u01de\u01e5\u01e9\u01eb\u01f4\u01f9\u01fe"+
		"\u0202\u0207\u020b\u0214\u021b\u0221\u0226\u022b\u0230\u0237\u023f\u0245"+
		"\u024a\u0257\u0260\u0263\u0266\u0272\u0277\u027b\u0285\u0289\u0297\u029b"+
		"\u02a2\u02ab\u02b2\u02b4\u02bc\u02ca\u02cf\u02d3\u02d6\u02d9\u02de\u02e2"+
		"\u02e8\u02f0\u02f5\u02f9\u02fb\u02ff\u0303\u0307\u030e\u0318\u0322\u0324"+
		"\u032a\u0334\u033b\u0348\u034d\u0350\u0357\u0368\u036d\u0372\u0377\u037d"+
		"\u0380\u0383\u0385\u0388\u038b\u0397\u039c\u03a1\u03ad\u03b2\u03b8\u03c5"+
		"\u03ce\u03da\u03e5\u03e9\u03eb\u03f1\u03f4\u03f7\u03fb\u040b\u0410\u0414"+
		"\u0417\u041f\u0425\u042a\u042e\u0439\u0440\u0447\u044f\u0456\u045a\u045d"+
		"\u0463\u046c\u0471\u0475\u0479\u047d\u0480\u0486\u048e\u0491\u0497\u04a1"+
		"\u04a8\u04ab\u04b3\u04ba\u04bd\u04c2\u04c5\u04ca\u04d1\u04d4\u04d7\u04db"+
		"\u04e2\u04e5\u04e8\u04ec\u04f3\u04f6\u04f9\u04fd\u0504\u0507\u050a\u050e"+
		"\u0517\u051a\u051d\u0521\u052a\u052d\u0530\u0534\u053b\u053f\u0542\u0545"+
		"\u0549\u054d\u0551\u0555\u0559\u055d\u0561\u0568\u056c\u0573\u0576\u057a"+
		"\u057e\u0582\u0584\u058a\u058d\u0597\u059e\u05a3\u05a9\u05b9\u05bc\u05c3"+
		"\u05c8\u05cf\u05d8\u05e2\u05f1\u05f8\u0600\u0606\u0611\u0617\u061a\u0633"+
		"\u0639\u0641\u0647\u064a\u0652\u0659\u065f\u0667\u0676\u067d\u0680\u0685"+
		"\u068a\u068d\u068f\u06aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}