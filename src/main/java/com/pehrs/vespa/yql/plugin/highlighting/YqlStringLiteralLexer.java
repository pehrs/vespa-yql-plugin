package com.pehrs.vespa.yql.plugin.highlighting;

import com.intellij.lexer.StringLiteralLexer;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class YqlStringLiteralLexer extends StringLiteralLexer {
  private static final String PERMISSIVE_ESCAPES;
  static {
    final StringBuilder escapesBuilder = new StringBuilder("/");
    for (char c = '\1'; c < '\255'; c++) {
      if (c != 'x' && c != 'u' && !Character.isDigit(c) && c != '\n' && c != '\r') {
        escapesBuilder.append(c);
      }
    }
    PERMISSIVE_ESCAPES = escapesBuilder.toString();
  }

  private final boolean myIsPermissiveDialect;

  public YqlStringLiteralLexer(char quoteChar, IElementType originalLiteralToken, boolean canEscapeEol, boolean isPermissiveDialect) {
    super(quoteChar, originalLiteralToken, canEscapeEol,
          isPermissiveDialect ? PERMISSIVE_ESCAPES : "/", false, isPermissiveDialect);
    myIsPermissiveDialect = isPermissiveDialect;
  }

  @Override
  protected @NotNull IElementType handleSingleSlashEscapeSequence() {
    return myIsPermissiveDialect ? myOriginalLiteralToken : super.handleSingleSlashEscapeSequence();
  }

  @Override
  protected boolean shouldAllowSlashZero() {
    return myIsPermissiveDialect;
  }
}
