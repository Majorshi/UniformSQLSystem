// Generated from uniformSQL.g4 by ANTLR 4.5
package cn.edu.bit.linc.zql.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link uniformSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface uniformSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(uniformSQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#delimited_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimited_statement(uniformSQLParser.Delimited_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#integer_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_types(uniformSQLParser.Integer_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#relational_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_op(uniformSQLParser.Relational_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#cast_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_data_type(uniformSQLParser.Cast_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#interval_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_unit(uniformSQLParser.Interval_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(uniformSQLParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#number_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_literal(uniformSQLParser.Number_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#hex_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex_literal(uniformSQLParser.Hex_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(uniformSQLParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(uniformSQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#functionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionList(uniformSQLParser.FunctionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#number_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_functions(uniformSQLParser.Number_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#char_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_functions(uniformSQLParser.Char_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#time_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_functions(uniformSQLParser.Time_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#other_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_functions(uniformSQLParser.Other_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#group_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_functions(uniformSQLParser.Group_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(uniformSQLParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(uniformSQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(uniformSQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#engine_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine_name(uniformSQLParser.Engine_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(uniformSQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(uniformSQLParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#parser_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParser_name(uniformSQLParser.Parser_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(uniformSQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#partition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_name(uniformSQLParser.Partition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#partition_logical_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_logical_name(uniformSQLParser.Partition_logical_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#constraintbol_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintbol_name(uniformSQLParser.Constraintbol_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#foreign_keybol_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_keybol_name(uniformSQLParser.Foreign_keybol_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(uniformSQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#event_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_name(uniformSQLParser.Event_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#user_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_name(uniformSQLParser.User_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(uniformSQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(uniformSQLParser.Procedure_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#server_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServer_name(uniformSQLParser.Server_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#wrapper_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapper_name(uniformSQLParser.Wrapper_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(uniformSQLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(uniformSQLParser.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#server_alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServer_alias_name(uniformSQLParser.Server_alias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#role_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_name(uniformSQLParser.Role_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#group_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_name(uniformSQLParser.Group_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#principal_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal_name(uniformSQLParser.Principal_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(uniformSQLParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#priv_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriv_type(uniformSQLParser.Priv_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(uniformSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#exp_factor1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_factor1(uniformSQLParser.Exp_factor1Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#exp_factor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_factor2(uniformSQLParser.Exp_factor2Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#exp_factor3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_factor3(uniformSQLParser.Exp_factor3Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#exp_factor4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_factor4(uniformSQLParser.Exp_factor4Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#bool_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_primary(uniformSQLParser.Bool_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(uniformSQLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#bit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_expr(uniformSQLParser.Bit_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#factor1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor1(uniformSQLParser.Factor1Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#factor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor2(uniformSQLParser.Factor2Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#factor3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor3(uniformSQLParser.Factor3Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#factor4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor4(uniformSQLParser.Factor4Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#factor5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor5(uniformSQLParser.Factor5Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#factor6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor6(uniformSQLParser.Factor6Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#factor7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor7(uniformSQLParser.Factor7Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(uniformSQLParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(uniformSQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#case_when_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_when_statement(uniformSQLParser.Case_when_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#case_when_statement1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_when_statement1(uniformSQLParser.Case_when_statement1Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#case_when_statement2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_when_statement2(uniformSQLParser.Case_when_statement2Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#column_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_spec(uniformSQLParser.Column_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#raw_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_expression_list(uniformSQLParser.Raw_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(uniformSQLParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#interval_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_expr(uniformSQLParser.Interval_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#table_references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_references(uniformSQLParser.Table_referencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(uniformSQLParser.Table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#table_factor1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_factor1(uniformSQLParser.Table_factor1Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#table_factor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_factor2(uniformSQLParser.Table_factor2Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#table_factor3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_factor3(uniformSQLParser.Table_factor3Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#table_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_atom(uniformSQLParser.Table_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#join_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_condition(uniformSQLParser.Join_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#index_hint_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_hint_list(uniformSQLParser.Index_hint_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#index_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_options(uniformSQLParser.Index_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#index_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_hint(uniformSQLParser.Index_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#index_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_list(uniformSQLParser.Index_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_clause(uniformSQLParser.Partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#partition_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_names(uniformSQLParser.Partition_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#root_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot_statement(uniformSQLParser.Root_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#data_manipulation_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_manipulation_statements(uniformSQLParser.Data_manipulation_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#data_definition_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_definition_statements(uniformSQLParser.Data_definition_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(uniformSQLParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#select_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_expression(uniformSQLParser.Select_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(uniformSQLParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#groupby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby_clause(uniformSQLParser.Groupby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#groupby_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby_item(uniformSQLParser.Groupby_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(uniformSQLParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#orderby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(uniformSQLParser.Orderby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#orderby_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_item(uniformSQLParser.Orderby_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(uniformSQLParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(uniformSQLParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#row_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_count(uniformSQLParser.Row_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(uniformSQLParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(uniformSQLParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(uniformSQLParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#table_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_spec(uniformSQLParser.Table_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#displayed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayed_column(uniformSQLParser.Displayed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(uniformSQLParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#insert_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_header(uniformSQLParser.Insert_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#insert_subfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_subfix(uniformSQLParser.Insert_subfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#value_list_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list_clause(uniformSQLParser.Value_list_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#column_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_value_list(uniformSQLParser.Column_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#set_columns_cluase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_columns_cluase(uniformSQLParser.Set_columns_cluaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#set_column_cluase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_column_cluase(uniformSQLParser.Set_column_cluaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#create_database_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_statement(uniformSQLParser.Create_database_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#drop_database_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_statement(uniformSQLParser.Drop_database_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#create_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_statement(uniformSQLParser.Create_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#create_table_statement1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_statement1(uniformSQLParser.Create_table_statement1Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#create_table_statement2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_statement2(uniformSQLParser.Create_table_statement2Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#create_table_statement3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_statement3(uniformSQLParser.Create_table_statement3Context ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#create_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_definition(uniformSQLParser.Create_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(uniformSQLParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#null_or_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_or_notnull(uniformSQLParser.Null_or_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#column_data_type_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_data_type_header(uniformSQLParser.Column_data_type_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#index_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_column_name(uniformSQLParser.Index_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#reference_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_definition(uniformSQLParser.Reference_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#reference_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_option(uniformSQLParser.Reference_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(uniformSQLParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#varchar_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarchar_length(uniformSQLParser.Varchar_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#binary_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_length(uniformSQLParser.Binary_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#alter_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_statement(uniformSQLParser.Alter_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#alter_table_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_specification(uniformSQLParser.Alter_table_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#index_column_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_column_names(uniformSQLParser.Index_column_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#index_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_type(uniformSQLParser.Index_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_option(uniformSQLParser.Index_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#column_definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definitions(uniformSQLParser.Column_definitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#rename_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_table_statement(uniformSQLParser.Rename_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#drop_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_statement(uniformSQLParser.Drop_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#drop_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_statement(uniformSQLParser.Drop_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#truncate_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_table_statement(uniformSQLParser.Truncate_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#create_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_statement(uniformSQLParser.Create_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#create_view_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_body(uniformSQLParser.Create_view_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#alter_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_view_statement(uniformSQLParser.Alter_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#create_user_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_statement(uniformSQLParser.Create_user_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#drop_user_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_user_statement(uniformSQLParser.Drop_user_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#grant_privilege_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_privilege_statement(uniformSQLParser.Grant_privilege_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#principal_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal_specification(uniformSQLParser.Principal_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#revoke_privilege_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_privilege_statement(uniformSQLParser.Revoke_privilege_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#show_event_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_event_statement(uniformSQLParser.Show_event_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#show_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_specification(uniformSQLParser.Show_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#set_event_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_event_statement(uniformSQLParser.Set_event_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#use_event_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_event_statement(uniformSQLParser.Use_event_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#server_event_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServer_event_statement(uniformSQLParser.Server_event_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#update_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statements(uniformSQLParser.Update_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link uniformSQLParser#delete_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statements(uniformSQLParser.Delete_statementsContext ctx);
}