// Generated from Sem.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SemParser}.
 */
public interface SemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SemParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(SemParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(SemParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SemParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SemParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemParser#definiciones}.
	 * @param ctx the parse tree
	 */
	void enterDefiniciones(SemParser.DefinicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemParser#definiciones}.
	 * @param ctx the parse tree
	 */
	void exitDefiniciones(SemParser.DefinicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemParser#carril}.
	 * @param ctx the parse tree
	 */
	void enterCarril(SemParser.CarrilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemParser#carril}.
	 * @param ctx the parse tree
	 */
	void exitCarril(SemParser.CarrilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemParser#sensor}.
	 * @param ctx the parse tree
	 */
	void enterSensor(SemParser.SensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemParser#sensor}.
	 * @param ctx the parse tree
	 */
	void exitSensor(SemParser.SensorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemParser#semaforo}.
	 * @param ctx the parse tree
	 */
	void enterSemaforo(SemParser.SemaforoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemParser#semaforo}.
	 * @param ctx the parse tree
	 */
	void exitSemaforo(SemParser.SemaforoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemParser#cruce}.
	 * @param ctx the parse tree
	 */
	void enterCruce(SemParser.CruceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemParser#cruce}.
	 * @param ctx the parse tree
	 */
	void exitCruce(SemParser.CruceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemParser#lista_problemas}.
	 * @param ctx the parse tree
	 */
	void enterLista_problemas(SemParser.Lista_problemasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemParser#lista_problemas}.
	 * @param ctx the parse tree
	 */
	void exitLista_problemas(SemParser.Lista_problemasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemParser#problemas}.
	 * @param ctx the parse tree
	 */
	void enterProblemas(SemParser.ProblemasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemParser#problemas}.
	 * @param ctx the parse tree
	 */
	void exitProblemas(SemParser.ProblemasContext ctx);
}