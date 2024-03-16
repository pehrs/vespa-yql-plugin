// This is a generated file. Not intended for manual editing.
package com.pehrs.vespa.yql.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.pehrs.vespa.yql.plugin.YqlElementTypes.*;
import com.pehrs.vespa.yql.plugin.psi.*;

public class YqlStringLiteralImpl extends YqlStringLiteralMixin implements YqlStringLiteral {

  public YqlStringLiteralImpl(ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull YqlElementVisitor visitor) {
    visitor.visitStringLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YqlElementVisitor) accept((YqlElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public @NotNull String getValue() {
    return YqlPsiImplUtils.getValue(this);
  }

  @Override
  public boolean isPropertyName() {
    return YqlPsiImplUtils.isPropertyName(this);
  }

}
