package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CsaMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CsaMstr
 * @author MyEclipse Persistence Tools
 */

public class CsaMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CsaMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CsaMstr transientInstance) {
		log.debug("saving CsaMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CsaMstr persistentInstance) {
		log.debug("deleting CsaMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CsaMstr findById(com.gopawpaw.erp.hibernate.c.CsaMstrId id) {
		log.debug("getting CsaMstr instance with id: " + id);
		try {
			CsaMstr instance = (CsaMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CsaMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CsaMstr instance) {
		log.debug("finding CsaMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding CsaMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CsaMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CsaMstr instances");
		try {
			String queryString = "from CsaMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CsaMstr merge(CsaMstr detachedInstance) {
		log.debug("merging CsaMstr instance");
		try {
			CsaMstr result = (CsaMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CsaMstr instance) {
		log.debug("attaching dirty CsaMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CsaMstr instance) {
		log.debug("attaching clean CsaMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CsaMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CsaMstrDAO) ctx.getBean("CsaMstrDAO");
	}
}